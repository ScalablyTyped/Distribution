package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectionEnd extends js.Object {
  var selectionEnd: Double
  var selectionStart: Double
}

object AnonSelectionEnd {
  @scala.inline
  def apply(selectionEnd: Double, selectionStart: Double): AnonSelectionEnd = {
    val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectionEnd]
  }
}

