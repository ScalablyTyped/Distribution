package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListZonesResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var zone: js.UndefOr[js.Array[Zone]] = js.undefined
}

object ListZonesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, zone: js.Array[Zone] = null): ListZonesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[ListZonesResponse]
  }
}

