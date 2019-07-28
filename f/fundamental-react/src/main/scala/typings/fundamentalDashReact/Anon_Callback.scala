package typings.fundamentalDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var text: String
  def callback(): Unit
}

object Anon_Callback {
  @scala.inline
  def apply(callback: () => Unit, text: String): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), text = text)
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

