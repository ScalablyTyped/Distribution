package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxDesignerElementEditor extends js.Object {
  var content: String
  var editorType: js.Any
  var extendedOptions: js.Any
  var header: String
}

object ASPxDesignerElementEditor {
  @scala.inline
  def apply(content: String, editorType: js.Any, extendedOptions: js.Any, header: String): ASPxDesignerElementEditor = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], extendedOptions = extendedOptions.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementEditor]
  }
}

