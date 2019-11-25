package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nonprofit extends js.Object {
  var nonprofitId: js.UndefOr[NonprofitId] = js.undefined
  var nonprofitLegalName: js.UndefOr[String] = js.undefined
}

object Nonprofit {
  @scala.inline
  def apply(nonprofitId: NonprofitId = null, nonprofitLegalName: String = null): Nonprofit = {
    val __obj = js.Dynamic.literal()
    if (nonprofitId != null) __obj.updateDynamic("nonprofitId")(nonprofitId.asInstanceOf[js.Any])
    if (nonprofitLegalName != null) __obj.updateDynamic("nonprofitLegalName")(nonprofitLegalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nonprofit]
  }
}

