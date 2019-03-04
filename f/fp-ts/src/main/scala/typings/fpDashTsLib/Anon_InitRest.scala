package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitRest[A] extends js.Object {
  var init: fpDashTsLib.libArrayMod.Global.Array[A]
  var rest: fpDashTsLib.libArrayMod.Global.Array[A]
}

object Anon_InitRest {
  @scala.inline
  def apply[A](init: fpDashTsLib.libArrayMod.Global.Array[A], rest: fpDashTsLib.libArrayMod.Global.Array[A]): Anon_InitRest[A] = {
    val __obj = js.Dynamic.literal(init = init, rest = rest)
  
    __obj.asInstanceOf[Anon_InitRest[A]]
  }
}

