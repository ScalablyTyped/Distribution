package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyList extends js.Object {
  var items: js.UndefOr[js.Array[Policy]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object PolicyList {
  @scala.inline
  def apply(items: js.Array[Policy] = null, kind: String = null): PolicyList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyList]
  }
}

