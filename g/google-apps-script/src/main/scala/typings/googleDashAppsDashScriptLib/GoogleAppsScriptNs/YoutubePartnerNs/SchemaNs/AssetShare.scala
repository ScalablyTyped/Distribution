package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetShare extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var shareId: js.UndefOr[java.lang.String] = js.undefined
  var viewId: js.UndefOr[java.lang.String] = js.undefined
}

object AssetShare {
  @scala.inline
  def apply(kind: java.lang.String = null, shareId: java.lang.String = null, viewId: java.lang.String = null): AssetShare = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (shareId != null) __obj.updateDynamic("shareId")(shareId)
    if (viewId != null) __obj.updateDynamic("viewId")(viewId)
    __obj.asInstanceOf[AssetShare]
  }
}

