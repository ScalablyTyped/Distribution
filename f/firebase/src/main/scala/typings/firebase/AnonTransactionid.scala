package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransactionid
  extends /* key */ StringDictionary[js.Any] {
  var currency: js.UndefOr[String] = js.undefined
  var transaction_id: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AnonTransactionid {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    currency: String = null,
    transaction_id: String = null,
    value: Int | Double = null
  ): AnonTransactionid = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (transaction_id != null) __obj.updateDynamic("transaction_id")(transaction_id.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransactionid]
  }
}

