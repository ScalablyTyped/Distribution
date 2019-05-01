package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var span: js.Object
  def end(): scala.Unit
  def start(): scala.Unit
  def status(status: java.lang.String): scala.Unit
}

object Anon_End {
  @scala.inline
  def apply(
    end: () => scala.Unit,
    span: js.Object,
    start: () => scala.Unit,
    status: java.lang.String => scala.Unit
  ): Anon_End = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), span = span, start = js.Any.fromFunction0(start), status = js.Any.fromFunction1(status))
  
    __obj.asInstanceOf[Anon_End]
  }
}

