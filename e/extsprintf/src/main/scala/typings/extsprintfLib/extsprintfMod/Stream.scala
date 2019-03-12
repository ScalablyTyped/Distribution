package typings
package extsprintfLib.extsprintfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def write(str: java.lang.String): scala.Unit
}

object Stream {
  @scala.inline
  def apply(write: java.lang.String => scala.Unit): Stream = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Stream]
  }
}

