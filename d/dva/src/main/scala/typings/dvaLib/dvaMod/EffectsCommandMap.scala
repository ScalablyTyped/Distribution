package typings
package dvaLib.dvaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectsCommandMap
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var call: js.Function
  var cancel: js.Function
  var select: js.Function
  var take: js.Function
  def put[A /* <: reduxLib.reduxMod.AnyAction */](action: A): js.Any
}

object EffectsCommandMap {
  @scala.inline
  def apply(
    call: js.Function,
    cancel: js.Function,
    put: js.Function1[js.Any, js.Any],
    select: js.Function,
    take: js.Function,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): EffectsCommandMap = {
    val __obj = js.Dynamic.literal(call = call, cancel = cancel, put = put, select = select, take = take)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EffectsCommandMap]
  }
}

