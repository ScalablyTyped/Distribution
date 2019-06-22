package typings
package fpDashTsLib.libStateMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind2[L, A] extends js.Object {
  var State: fpDashTsLib.libStateMod.State[L, A]
}

object URItoKind2 {
  @scala.inline
  def apply[L, A](State: fpDashTsLib.libStateMod.State[L, A]): URItoKind2[L, A] = {
    val __obj = js.Dynamic.literal(State = State)
  
    __obj.asInstanceOf[URItoKind2[L, A]]
  }
}

