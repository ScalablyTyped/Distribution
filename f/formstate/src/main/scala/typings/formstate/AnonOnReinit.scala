package typings.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnReinit extends js.Object {
  @JSName("on$Reinit")
  def on$Reinit(): Unit
  @JSName("on$ValidationPass")
  def on$ValidationPass(): Unit
}

object AnonOnReinit {
  @scala.inline
  def apply(on$Reinit: () => Unit, on$ValidationPass: () => Unit): AnonOnReinit = {
    val __obj = js.Dynamic.literal(on$Reinit = js.Any.fromFunction0(on$Reinit), on$ValidationPass = js.Any.fromFunction0(on$ValidationPass))
    __obj.asInstanceOf[AnonOnReinit]
  }
}

