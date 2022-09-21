package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientComboBox.CustomHighlighting and ASPxClientListBox.CustomHighlighting events.
  */
trait ASPxClientListEditCustomHighlightingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String
  
  /**
    * Specifies rules according to which the editor highlights the filtered items.
    */
  var highlighting: Any
}
object ASPxClientListEditCustomHighlightingEventArgs {
  
  inline def apply(filter: String, highlighting: Any): ASPxClientListEditCustomHighlightingEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], highlighting = highlighting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditCustomHighlightingEventArgs]
  }
  
  extension [Self <: ASPxClientListEditCustomHighlightingEventArgs](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setHighlighting(value: Any): Self = StObject.set(x, "highlighting", value.asInstanceOf[js.Any])
  }
}
