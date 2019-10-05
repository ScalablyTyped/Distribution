package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.firebaseMod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items
  extends /* key */ StringDictionary[js.Any] {
  var items: js.UndefOr[js.Array[Item]] = js.undefined
}

object Anon_Items {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, items: js.Array[Item] = null): Anon_Items = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_Items]
  }
}

