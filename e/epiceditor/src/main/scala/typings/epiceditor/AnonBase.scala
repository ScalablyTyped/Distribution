package typings.epiceditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: String
  var editor: String
  var preview: String
}

object AnonBase {
  @scala.inline
  def apply(base: String, editor: String, preview: String): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase]
  }
}

