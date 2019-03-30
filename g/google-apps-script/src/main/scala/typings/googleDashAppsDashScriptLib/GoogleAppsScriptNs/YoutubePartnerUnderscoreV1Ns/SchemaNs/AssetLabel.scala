package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetLabel extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var labelName: js.UndefOr[java.lang.String] = js.undefined
}

object AssetLabel {
  @scala.inline
  def apply(kind: java.lang.String = null, labelName: java.lang.String = null): AssetLabel = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labelName != null) __obj.updateDynamic("labelName")(labelName)
    __obj.asInstanceOf[AssetLabel]
  }
}

