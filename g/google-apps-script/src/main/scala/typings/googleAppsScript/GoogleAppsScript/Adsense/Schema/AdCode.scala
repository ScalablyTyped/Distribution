package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

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
    if (adCode != null) __obj.updateDynamic("adCode")(adCode.asInstanceOf[js.Any])
    if (ampBody != null) __obj.updateDynamic("ampBody")(ampBody.asInstanceOf[js.Any])
    if (ampHead != null) __obj.updateDynamic("ampHead")(ampHead.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCode]
  }
}

