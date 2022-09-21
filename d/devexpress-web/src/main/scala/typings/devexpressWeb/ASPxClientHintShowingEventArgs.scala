package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHint.Showing event.
  */
trait ASPxClientHintShowingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the event should be canceled.
    */
  var cancel: Boolean
  
  /**
    * Gets the object that is the hint's content.
    */
  var contentElement: Any
  
  /**
    * Gets the object that is the hint.
    */
  var hintElement: Any
  
  /**
    * Gets the object that is the hint's target element.
    */
  var targetElement: Any
  
  /**
    * Gets the object that is the hint's title.
    */
  var titleElement: Any
}
object ASPxClientHintShowingEventArgs {
  
  inline def apply(cancel: Boolean, contentElement: Any, hintElement: Any, targetElement: Any, titleElement: Any): ASPxClientHintShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], contentElement = contentElement.asInstanceOf[js.Any], hintElement = hintElement.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], titleElement = titleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHintShowingEventArgs]
  }
  
  extension [Self <: ASPxClientHintShowingEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setContentElement(value: Any): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    inline def setHintElement(value: Any): Self = StObject.set(x, "hintElement", value.asInstanceOf[js.Any])
    
    inline def setTargetElement(value: Any): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    inline def setTitleElement(value: Any): Self = StObject.set(x, "titleElement", value.asInstanceOf[js.Any])
  }
}
