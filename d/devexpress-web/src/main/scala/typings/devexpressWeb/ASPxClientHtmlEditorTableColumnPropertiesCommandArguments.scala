package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLECOLUMNPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTableColumnPropertiesCommandArguments
  extends StObject
     with ASPxClientHtmlEditorCommandArguments {
  
  /**
    * Contains the style settings defining the appearance of the target column element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}
object ASPxClientHtmlEditorTableColumnPropertiesCommandArguments {
  
  inline def apply(selectedElement: Any, styleSettings: ASPxClientHtmlEditorCommandStyleSettings): ASPxClientHtmlEditorTableColumnPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTableColumnPropertiesCommandArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorTableColumnPropertiesCommandArguments] (val x: Self) extends AnyVal {
    
    inline def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = StObject.set(x, "styleSettings", value.asInstanceOf[js.Any])
  }
}
