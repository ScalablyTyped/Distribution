package typings
package durandalLib.binderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingInstruction extends js.Object {
  var applyBindings: scala.Boolean
}

object BindingInstruction {
  @scala.inline
  def apply(applyBindings: scala.Boolean): BindingInstruction = {
    val __obj = js.Dynamic.literal(applyBindings = applyBindings)
  
    __obj.asInstanceOf[BindingInstruction]
  }
}

