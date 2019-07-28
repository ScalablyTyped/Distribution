package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var span: js.Object
  def end(): Unit
  def start(): Unit
  def status(status: String): Unit
}

object Anon_End {
  @scala.inline
  def apply(end: () => Unit, span: js.Object, start: () => Unit, status: String => Unit): Anon_End = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), span = span, start = js.Any.fromFunction0(start), status = js.Any.fromFunction1(status))
  
    __obj.asInstanceOf[Anon_End]
  }
}

