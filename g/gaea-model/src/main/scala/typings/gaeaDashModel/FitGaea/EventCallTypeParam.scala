package typings.gaeaDashModel.FitGaea

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
    val __obj = js.Dynamic.literal(editor = editor, field = field, label = label)
  
    __obj.asInstanceOf[EventCallTypeParam]
  }
}

