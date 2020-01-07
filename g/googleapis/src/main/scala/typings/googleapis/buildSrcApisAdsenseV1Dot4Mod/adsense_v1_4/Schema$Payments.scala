package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Payments extends js.Object {
  /**
    * The list of Payments for the account. One or both of a) the account&#39;s
    * most recent payment; and b) the account&#39;s upcoming payment.
    */
  var items: js.UndefOr[js.Array[Schema$Payment]] = js.native
  /**
    * Kind of list this is, in this case adsense#payments.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Payments {
  @scala.inline
  def apply(items: js.Array[Schema$Payment] = null, kind: String = null): Schema$Payments = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Payments]
  }
}

