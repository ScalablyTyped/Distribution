package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error
  extends expoLib.expoMod.AuthSessionNs.StartAsyncResponse {
  var errorCode: java.lang.String
  var event: expoLib.expoMod.HashMap
  var params: expoLib.expoMod.HashMap
  var `type`: expoLib.expoLibStrings.error
}

object Anon_Error {
  @scala.inline
  def apply(
    errorCode: java.lang.String,
    event: expoLib.expoMod.HashMap,
    params: expoLib.expoMod.HashMap,
    `type`: expoLib.expoLibStrings.error
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Error]
  }
}

