package typings.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnReinit extends js.Object {
  @JSName("on$Reinit")
  def on$Reinit(): Unit
  @JSName("on$ValidationPass")
  def on$ValidationPass(): Unit
}

object Anon_OnReinit {
  @scala.inline
  def apply(on$Reinit: () => Unit, on$ValidationPass: () => Unit): Anon_OnReinit = {
    val __obj = js.Dynamic.literal(on$Reinit = js.Any.fromFunction0(on$Reinit), on$ValidationPass = js.Any.fromFunction0(on$ValidationPass))
  
    __obj.asInstanceOf[Anon_OnReinit]
  }
}

