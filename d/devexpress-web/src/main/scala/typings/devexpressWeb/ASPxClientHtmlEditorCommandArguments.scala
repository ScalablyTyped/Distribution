package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for parameters used in the ASPxHtmlEditor's client-side commands.
  */
trait ASPxClientHtmlEditorCommandArguments extends StObject {
  
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    */
  var selectedElement: Any
}
object ASPxClientHtmlEditorCommandArguments {
  
  inline def apply(selectedElement: Any): ASPxClientHtmlEditorCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorCommandArguments] (val x: Self) extends AnyVal {
    
    inline def setSelectedElement(value: Any): Self = StObject.set(x, "selectedElement", value.asInstanceOf[js.Any])
  }
}
