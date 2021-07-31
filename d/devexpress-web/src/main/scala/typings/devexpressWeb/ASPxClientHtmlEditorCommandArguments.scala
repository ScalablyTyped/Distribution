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
  var selectedElement: js.Any
}
object ASPxClientHtmlEditorCommandArguments {
  
  @scala.inline
  def apply(selectedElement: js.Any): ASPxClientHtmlEditorCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandArguments]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCommandArgumentsMutableBuilder[Self <: ASPxClientHtmlEditorCommandArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedElement(value: js.Any): Self = StObject.set(x, "selectedElement", value.asInstanceOf[js.Any])
  }
}
