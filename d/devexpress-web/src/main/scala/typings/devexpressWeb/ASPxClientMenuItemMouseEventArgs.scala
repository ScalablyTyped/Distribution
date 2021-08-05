package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events which relate to mouse hovering (such as entering or leaving) over menu items.
  */
trait ASPxClientMenuItemMouseEventArgs
  extends StObject
     with ASPxClientMenuItemEventArgs {
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any
}
object ASPxClientMenuItemMouseEventArgs {
  
  inline def apply(htmlElement: js.Any, item: ASPxClientMenuItem): ASPxClientMenuItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(htmlElement = htmlElement.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItemMouseEventArgs]
  }
  
  extension [Self <: ASPxClientMenuItemMouseEventArgs](x: Self) {
    
    inline def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
  }
}
