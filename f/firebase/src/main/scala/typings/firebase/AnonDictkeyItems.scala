package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkeyItems
  extends /* key */ StringDictionary[js.Any] {
  var items: js.UndefOr[js.Array[Item]] = js.undefined
}

object AnonDictkeyItems {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, items: js.Array[Item] = null): AnonDictkeyItems = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkeyItems]
  }
}

