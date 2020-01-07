package typings.googleapis.buildSrcApisAdsensehostV4Dot1Mod.adsensehost_v4_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AdCode extends js.Object {
  /**
    * The ad code snippet.
    */
  var adCode: js.UndefOr[String] = js.native
  /**
    * Kind this is, in this case adsensehost#adCode.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AdCode {
  @scala.inline
  def apply(adCode: String = null, kind: String = null): Schema$AdCode = {
    val __obj = js.Dynamic.literal()
    if (adCode != null) __obj.updateDynamic("adCode")(adCode.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdCode]
  }
}

