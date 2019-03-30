package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosStore extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var storeAddress: js.UndefOr[java.lang.String] = js.undefined
  var storeCode: js.UndefOr[java.lang.String] = js.undefined
}

object PosStore {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    storeAddress: java.lang.String = null,
    storeCode: java.lang.String = null
  ): PosStore = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (storeAddress != null) __obj.updateDynamic("storeAddress")(storeAddress)
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode)
    __obj.asInstanceOf[PosStore]
  }
}

