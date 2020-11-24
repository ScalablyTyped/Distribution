package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTIMAGE_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorInsertImageCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  
  /**
    * Determines the position of the target image.
    */
  var align: String = js.native
  
  /**
    * Creates an alternate text for the target image.
    */
  var alt: String = js.native
  
  /**
    * Specifies the source of the target image.
    */
  var src: String = js.native
  
  /**
    * Contains the style settings specifying the appearance of the target image.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  
  /**
    * Determines if the target image is wrapped with text.
    */
  var useFloat: Boolean = js.native
}
object ASPxClientHtmlEditorInsertImageCommandArguments {
  
  @scala.inline
  def apply(
    align: String,
    alt: String,
    selectedElement: js.Any,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    useFloat: Boolean
  ): ASPxClientHtmlEditorInsertImageCommandArguments = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alt = alt.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any], useFloat = useFloat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertImageCommandArguments]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorInsertImageCommandArgumentsOps[Self <: ASPxClientHtmlEditorInsertImageCommandArguments] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = this.set("styleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFloat(value: Boolean): Self = this.set("useFloat", value.asInstanceOf[js.Any])
  }
}
