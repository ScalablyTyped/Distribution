package typings.emojiMart.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, (): react.react.ReactNode> */
trait RecordCategoryNameReactNo extends js.Object {
  var activity: js.Function0[ReactNode]
  var custom: js.Function0[ReactNode]
  var flags: js.Function0[ReactNode]
  var foods: js.Function0[ReactNode]
  var nature: js.Function0[ReactNode]
  var objects: js.Function0[ReactNode]
  var people: js.Function0[ReactNode]
  var places: js.Function0[ReactNode]
  var recent: js.Function0[ReactNode]
  var search: js.Function0[ReactNode]
  var symbols: js.Function0[ReactNode]
}

object RecordCategoryNameReactNo {
  @scala.inline
  def apply(
    activity: () => ReactNode,
    custom: () => ReactNode,
    flags: () => ReactNode,
    foods: () => ReactNode,
    nature: () => ReactNode,
    objects: () => ReactNode,
    people: () => ReactNode,
    places: () => ReactNode,
    recent: () => ReactNode,
    search: () => ReactNode,
    symbols: () => ReactNode
  ): RecordCategoryNameReactNo = {
    val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), custom = js.Any.fromFunction0(custom), flags = js.Any.fromFunction0(flags), foods = js.Any.fromFunction0(foods), nature = js.Any.fromFunction0(nature), objects = js.Any.fromFunction0(objects), people = js.Any.fromFunction0(people), places = js.Any.fromFunction0(places), recent = js.Any.fromFunction0(recent), search = js.Any.fromFunction0(search), symbols = js.Any.fromFunction0(symbols))
    __obj.asInstanceOf[RecordCategoryNameReactNo]
  }
}

