package typings.gapiDotClientDotAdsensehost.gapi.client.adsensehost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCode extends js.Object {
  /** The ad code snippet. */
  var adCode: js.UndefOr[String] = js.undefined
  /** Kind this is, in this case adsensehost#adCode. */
  var kind: js.UndefOr[String] = js.undefined
}

object AdCode {
  @scala.inline
  def apply(adCode: String = null, kind: String = null): AdCode = {
    val __obj = js.Dynamic.literal()
    if (adCode != null) __obj.updateDynamic("adCode")(adCode)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AdCode]
  }
}

