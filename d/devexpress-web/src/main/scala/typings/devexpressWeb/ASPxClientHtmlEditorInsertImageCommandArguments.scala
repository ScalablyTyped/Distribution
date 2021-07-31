package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTIMAGE_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertImageCommandArguments
  extends StObject
     with ASPxClientHtmlEditorCommandArguments {
  
  /**
    * Determines the position of the target image.
    */
  var align: String
  
  /**
    * Creates an alternate text for the target image.
    */
  var alt: String
  
  /**
    * Specifies the source of the target image.
    */
  var src: String
  
  /**
    * Contains the style settings specifying the appearance of the target image.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  
  /**
    * Determines if the target image is wrapped with text.
    */
  var useFloat: Boolean
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
  implicit class ASPxClientHtmlEditorInsertImageCommandArgumentsMutableBuilder[Self <: ASPxClientHtmlEditorInsertImageCommandArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = StObject.set(x, "styleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFloat(value: Boolean): Self = StObject.set(x, "useFloat", value.asInstanceOf[js.Any])
  }
}
