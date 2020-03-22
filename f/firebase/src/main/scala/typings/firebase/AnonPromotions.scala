package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Promotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromotions
  extends /* key */ StringDictionary[js.Any] {
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
}

object AnonPromotions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    promotions: js.Array[Promotion] = null
  ): AnonPromotions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPromotions]
  }
}

