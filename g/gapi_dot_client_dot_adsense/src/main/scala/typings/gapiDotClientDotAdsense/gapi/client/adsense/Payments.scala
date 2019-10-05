package typings.gapiDotClientDotAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payments extends js.Object {
  /** The list of Payments for the account. One or both of a) the account's most recent payment; and b) the account's upcoming payment. */
  var items: js.UndefOr[js.Array[Payment]] = js.undefined
  /** Kind of list this is, in this case adsense#payments. */
  var kind: js.UndefOr[String] = js.undefined
}

object Payments {
  @scala.inline
  def apply(items: js.Array[Payment] = null, kind: String = null): Payments = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Payments]
  }
}

