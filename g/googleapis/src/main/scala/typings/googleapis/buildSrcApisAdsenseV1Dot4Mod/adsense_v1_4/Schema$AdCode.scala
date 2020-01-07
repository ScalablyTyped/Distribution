package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AdCode extends js.Object {
  /**
    * The Auto ad code snippet. The ad code snippet.
    */
  var adCode: js.UndefOr[String] = js.native
  /**
    * The AMP Auto ad code snippet that goes in the body of an AMP page.
    */
  var ampBody: js.UndefOr[String] = js.native
  /**
    * The AMP Auto ad code snippet that goes in the head of an AMP page.
    */
  var ampHead: js.UndefOr[String] = js.native
  /**
    * Kind this is, in this case adsense#adCode.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AdCode {
  @scala.inline
  def apply(adCode: String = null, ampBody: String = null, ampHead: String = null, kind: String = null): Schema$AdCode = {
    val __obj = js.Dynamic.literal()
    if (adCode != null) __obj.updateDynamic("adCode")(adCode.asInstanceOf[js.Any])
    if (ampBody != null) __obj.updateDynamic("ampBody")(ampBody.asInstanceOf[js.Any])
    if (ampHead != null) __obj.updateDynamic("ampHead")(ampHead.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdCode]
  }
}

