package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for parameters related to inserting or changing media elements in the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorChangeMediaElementCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  
  /**
    * Returns the name of the client-side command corresponding to the parameter.
    */
  def GetCommandName(): String = js.native
  
  /**
    * Determines the position of the target media element.
    */
  var align: String = js.native
  
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML "id"</a> attribute of the target media element.
    */
  var id: String = js.native
  
  /**
    * Defines the source of the target media element.
    */
  var src: String = js.native
  
  /**
    * Contains the style settings defining the appearance of the target media element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
}
object ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    id: String,
    selectedElement: js.Any,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorChangeMediaElementCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorChangeMediaElementCommandArguments]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorChangeMediaElementCommandArgumentsOps[Self <: ASPxClientHtmlEditorChangeMediaElementCommandArguments] (val x: Self) extends AnyVal {
    
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
    def setGetCommandName(value: () => String): Self = this.set("GetCommandName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = this.set("styleSettings", value.asInstanceOf[js.Any])
  }
}
