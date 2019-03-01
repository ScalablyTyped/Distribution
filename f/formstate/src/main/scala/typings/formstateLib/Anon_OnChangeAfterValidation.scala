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
  def apply(on$ChangeAfterValidation: js.Function0[scala.Unit], on$Reinit: js.Function0[scala.Unit]): Anon_OnChangeAfterValidation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on$ChangeAfterValidation")(on$ChangeAfterValidation)
    __obj.updateDynamic("on$Reinit")(on$Reinit)
    __obj.asInstanceOf[Anon_OnChangeAfterValidation]
  }
}

