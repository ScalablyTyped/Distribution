package typings.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unwatch extends js.Object {
  def unwatch(): Unit
}

object Anon_Unwatch {
  @scala.inline
  def apply(unwatch: () => Unit): Anon_Unwatch = {
    val __obj = js.Dynamic.literal(unwatch = js.Any.fromFunction0(unwatch))
  
    __obj.asInstanceOf[Anon_Unwatch]
  }
}

