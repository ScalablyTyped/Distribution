package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCode extends js.Object {
  var adCode: js.UndefOr[java.lang.String] = js.undefined
  var ampBody: js.UndefOr[java.lang.String] = js.undefined
  var ampHead: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AdCode {
  @scala.inline
  def apply(
    adCode: java.lang.String = null,
    ampBody: java.lang.String = null,
    ampHead: java.lang.String = null,
    kind: java.lang.String = null
  ): AdCode = {
    val __obj = js.Dynamic.literal()
    if (adCode != null) __obj.updateDynamic("adCode")(adCode)
    if (ampBody != null) __obj.updateDynamic("ampBody")(ampBody)
    if (ampHead != null) __obj.updateDynamic("ampHead")(ampHead)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AdCode]
  }
}

