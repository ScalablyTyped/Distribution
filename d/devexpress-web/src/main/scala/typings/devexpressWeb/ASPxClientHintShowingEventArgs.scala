package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHint.Showing event.
  */
@js.native
trait ASPxClientHintShowingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the event should be canceled.
    */
  var cancel: Boolean = js.native
  
  /**
    * Gets the object that is the hint's content.
    */
  var contentElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint.
    */
  var hintElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint's target element.
    */
  var targetElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint's title.
    */
  var titleElement: js.Any = js.native
}
object ASPxClientHintShowingEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    contentElement: js.Any,
    hintElement: js.Any,
    targetElement: js.Any,
    titleElement: js.Any
  ): ASPxClientHintShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], contentElement = contentElement.asInstanceOf[js.Any], hintElement = hintElement.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], titleElement = titleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHintShowingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHintShowingEventArgsMutableBuilder[Self <: ASPxClientHintShowingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElement(value: js.Any): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintElement(value: js.Any): Self = StObject.set(x, "hintElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetElement(value: js.Any): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleElement(value: js.Any): Self = StObject.set(x, "titleElement", value.asInstanceOf[js.Any])
  }
}
