package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionEnd extends js.Object {
  var selectionEnd: Double
  var selectionStart: Double
}

object SelectionEnd {
  @scala.inline
  def apply(selectionEnd: Double, selectionStart: Double): SelectionEnd = {
    val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionEnd]
  }
}

