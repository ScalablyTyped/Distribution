package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCode extends js.Object {
  var adCode: js.UndefOr[String] = js.undefined
  var ampBody: js.UndefOr[String] = js.undefined
  var ampHead: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AdCode {
  @scala.inline
  def apply(adCode: String = null, ampBody: String = null, ampHead: String = null, kind: String = null): AdCode = {
    val __obj = js.Dynamic.literal()
    if (adCode != null) __obj.updateDynamic("adCode")(adCode)
    if (ampBody != null) __obj.updateDynamic("ampBody")(ampBody)
    if (ampHead != null) __obj.updateDynamic("ampHead")(ampHead)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AdCode]
  }
}

