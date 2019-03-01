package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelectionEnd extends js.Object {
  var selectionEnd: java.lang.String
  var selectionStart: java.lang.String
}

object Anon_SelectionEnd {
  @scala.inline
  def apply(selectionEnd: java.lang.String, selectionStart: java.lang.String): Anon_SelectionEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectionEnd")(selectionEnd)
    __obj.updateDynamic("selectionStart")(selectionStart)
    __obj.asInstanceOf[Anon_SelectionEnd]
  }
}

