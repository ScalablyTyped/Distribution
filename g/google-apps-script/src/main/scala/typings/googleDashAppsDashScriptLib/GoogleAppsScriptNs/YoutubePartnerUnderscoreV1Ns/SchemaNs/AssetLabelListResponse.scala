package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetLabelListResponse extends js.Object {
  var items: js.UndefOr[js.Array[AssetLabel]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AssetLabelListResponse {
  @scala.inline
  def apply(items: js.Array[AssetLabel] = null, kind: java.lang.String = null): AssetLabelListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AssetLabelListResponse]
  }
}

