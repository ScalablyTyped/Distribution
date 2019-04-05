package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOwnerListResponse extends js.Object {
  var items: js.UndefOr[js.Array[ContentOwner]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ContentOwnerListResponse {
  @scala.inline
  def apply(items: js.Array[ContentOwner] = null, kind: java.lang.String = null): ContentOwnerListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ContentOwnerListResponse]
  }
}

