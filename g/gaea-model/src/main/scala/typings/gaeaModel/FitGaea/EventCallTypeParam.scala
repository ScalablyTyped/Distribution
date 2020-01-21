package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCallTypeParam extends js.Object {
  var editor: String
  var field: String
  var label: String
}

object EventCallTypeParam {
  @scala.inline
  def apply(editor: String, field: String, label: String): EventCallTypeParam = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventCallTypeParam]
  }
}

