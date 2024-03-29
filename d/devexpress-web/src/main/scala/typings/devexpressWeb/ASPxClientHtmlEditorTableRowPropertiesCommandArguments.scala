package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings related to the ASPxClientCommandConsts.TABLEROWPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTableRowPropertiesCommandArguments
  extends StObject
     with ASPxClientHtmlEditorCommandArguments {
  
  /**
    * Contains the style settings specifying the appearance of the specified table row.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
}
object ASPxClientHtmlEditorTableRowPropertiesCommandArguments {
  
  inline def apply(selectedElement: Any, styleSettings: ASPxClientHtmlEditorCommandStyleSettings): ASPxClientHtmlEditorTableRowPropertiesCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTableRowPropertiesCommandArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorTableRowPropertiesCommandArguments] (val x: Self) extends AnyVal {
    
    inline def setStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = StObject.set(x, "styleSettings", value.asInstanceOf[js.Any])
  }
}
