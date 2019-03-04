package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Init[B /* <: A */, A] extends js.Object {
  var init: fpDashTsLib.libArrayMod.Global.Array[B]
  var rest: fpDashTsLib.libArrayMod.Global.Array[A]
}

object Anon_Init {
  @scala.inline
  def apply[B /* <: A */, A](init: fpDashTsLib.libArrayMod.Global.Array[B], rest: fpDashTsLib.libArrayMod.Global.Array[A]): Anon_Init[B, A] = {
    val __obj = js.Dynamic.literal(init = init, rest = rest)
  
    __obj.asInstanceOf[Anon_Init[B, A]]
  }
}

