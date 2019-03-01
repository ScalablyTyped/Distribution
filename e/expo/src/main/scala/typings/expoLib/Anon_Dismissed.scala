package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dismissed
  extends expoLib.expoMod.AuthSessionNs.StartAsyncResponse {
  var `type`: expoLib.expoLibStrings.dismissed
}

object Anon_Dismissed {
  @scala.inline
  def apply(`type`: expoLib.expoLibStrings.dismissed): Anon_Dismissed = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[Anon_Dismissed]
  }
}

