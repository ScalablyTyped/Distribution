package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerElementEditor extends js.Object {
  
  var content: String = js.native
  
  var editorType: js.Any = js.native
  
  var extendedOptions: js.Any = js.native
  
  var header: String = js.native
}
object ASPxDesignerElementEditor {
  
  @scala.inline
  def apply(content: String, editorType: js.Any, extendedOptions: js.Any, header: String): ASPxDesignerElementEditor = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], extendedOptions = extendedOptions.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerElementEditor]
  }
  
  @scala.inline
  implicit class ASPxDesignerElementEditorOps[Self <: ASPxDesignerElementEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorType(value: js.Any): Self = this.set("editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedOptions(value: js.Any): Self = this.set("extendedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
  }
}
