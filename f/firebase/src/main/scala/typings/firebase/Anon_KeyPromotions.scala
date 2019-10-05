package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.firebaseMod.analytics.Promotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyPromotions
  extends /* key */ StringDictionary[js.Any] {
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
}

object Anon_KeyPromotions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    promotions: js.Array[Promotion] = null
  ): Anon_KeyPromotions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    __obj.asInstanceOf[Anon_KeyPromotions]
  }
}

