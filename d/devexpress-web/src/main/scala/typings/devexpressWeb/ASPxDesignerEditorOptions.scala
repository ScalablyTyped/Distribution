package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerEditorOptions extends js.Object {
  var content: String
  var editorType: js.Any
  var header: String
}

object ASPxDesignerEditorOptions {
  @scala.inline
  def apply(content: String, editorType: js.Any, header: String): ASPxDesignerEditorOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerEditorOptions]
  }
}

