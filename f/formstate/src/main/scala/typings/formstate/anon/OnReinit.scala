package typings.formstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReinit extends js.Object {
  @JSName("on$Reinit")
  def on$Reinit(): Unit
  @JSName("on$ValidationPass")
  def on$ValidationPass(): Unit
}

object OnReinit {
  @scala.inline
  def apply(on$Reinit: () => Unit, on$ValidationPass: () => Unit): OnReinit = {
    val __obj = js.Dynamic.literal(on$Reinit = js.Any.fromFunction0(on$Reinit), on$ValidationPass = js.Any.fromFunction0(on$ValidationPass))
    __obj.asInstanceOf[OnReinit]
  }
}

