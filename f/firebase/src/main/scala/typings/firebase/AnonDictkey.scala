package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var currency: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    currency: String = null,
    items: js.Array[Item] = null,
    value: Int | Double = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

