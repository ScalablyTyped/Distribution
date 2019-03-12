package typings
package formstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnChangeAfterValidation extends js.Object {
  @JSName("on$ChangeAfterValidation")
  def on$ChangeAfterValidation(): scala.Unit
  @JSName("on$Reinit")
  def on$Reinit(): scala.Unit
}

object Anon_OnChangeAfterValidation {
  @scala.inline
  def apply(on$ChangeAfterValidation: () => scala.Unit, on$Reinit: () => scala.Unit): Anon_OnChangeAfterValidation = {
    val __obj = js.Dynamic.literal(on$ChangeAfterValidation = js.Any.fromFunction0(on$ChangeAfterValidation), on$Reinit = js.Any.fromFunction0(on$Reinit))
  
    __obj.asInstanceOf[Anon_OnChangeAfterValidation]
  }
}

