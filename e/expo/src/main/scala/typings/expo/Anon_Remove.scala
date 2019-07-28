package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Remove extends js.Object {
  def remove(): Unit
}

object Anon_Remove {
  @scala.inline
  def apply(remove: () => Unit): Anon_Remove = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[Anon_Remove]
  }
}

