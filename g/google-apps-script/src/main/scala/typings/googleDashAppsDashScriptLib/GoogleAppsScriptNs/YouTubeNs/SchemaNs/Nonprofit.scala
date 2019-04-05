package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nonprofit extends js.Object {
  var nonprofitId: js.UndefOr[NonprofitId] = js.undefined
  var nonprofitLegalName: js.UndefOr[java.lang.String] = js.undefined
}

object Nonprofit {
  @scala.inline
  def apply(nonprofitId: NonprofitId = null, nonprofitLegalName: java.lang.String = null): Nonprofit = {
    val __obj = js.Dynamic.literal()
    if (nonprofitId != null) __obj.updateDynamic("nonprofitId")(nonprofitId)
    if (nonprofitLegalName != null) __obj.updateDynamic("nonprofitLegalName")(nonprofitLegalName)
    __obj.asInstanceOf[Nonprofit]
  }
}

