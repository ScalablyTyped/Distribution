package typings.dva.dvaMod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.reduxMod.AnyAction
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
    val __obj = js.Dynamic.literal(call = call, cancel = cancel, put = js.Any.fromFunction1(put), select = select, take = take)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EffectsCommandMap]
  }
}

