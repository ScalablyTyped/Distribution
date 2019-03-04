package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event
  extends expoLib.expoMod.AuthSessionNs.StartAsyncResponse {
  var event: expoLib.expoMod.HashMap
  var params: expoLib.expoMod.HashMap
  var `type`: expoLib.expoLibStrings.success
}

object Anon_Event {
  @scala.inline
  def apply(
    event: expoLib.expoMod.HashMap,
    params: expoLib.expoMod.HashMap,
    `type`: expoLib.expoLibStrings.success
  ): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event, params = params)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Event]
  }
}

