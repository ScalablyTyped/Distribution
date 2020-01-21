package typings.dva.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectsCommandMap
  extends /* key */ StringDictionary[js.Any] {
  var call: js.Function
  var cancel: js.Function
  var select: js.Function
  var take: js.Function
  def put[A /* <: AnyAction */](action: A): js.Any
}

object EffectsCommandMap {
  @scala.inline
  def apply(
    call: js.Function,
    cancel: js.Function,
    put: js.Any => js.Any,
    select: js.Function,
    take: js.Function,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): EffectsCommandMap = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), select = select.asInstanceOf[js.Any], take = take.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EffectsCommandMap]
  }
}

