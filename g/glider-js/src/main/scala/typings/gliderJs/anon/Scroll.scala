package typings.gliderJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scroll extends js.Object {
  def scroll(): Unit
}

object Scroll {
  @scala.inline
  def apply(scroll: () => Unit): Scroll = {
    val __obj = js.Dynamic.literal(scroll = js.Any.fromFunction0(scroll))
    __obj.asInstanceOf[Scroll]
  }
}

