package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFilterViewRequest extends js.Object {
  var filterId: js.UndefOr[scala.Double] = js.undefined
}

object DeleteFilterViewRequest {
  @scala.inline
  def apply(filterId: scala.Int | scala.Double = null): DeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterViewRequest]
  }
}

