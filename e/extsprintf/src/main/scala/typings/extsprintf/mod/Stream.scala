package typings.extsprintf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def write(str: String): Unit
}

object Stream {
  @scala.inline
  def apply(write: String => Unit): Stream = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Stream]
  }
}

