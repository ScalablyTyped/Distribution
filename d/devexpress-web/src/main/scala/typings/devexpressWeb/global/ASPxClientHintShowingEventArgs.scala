package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHint.Showing event.
  */
@JSGlobal("ASPxClientHintShowingEventArgs")
@js.native
open class ASPxClientHintShowingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHintShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHintShowingEventArgs class with specified settings.
    * @param targetElement An object that is the target element of the hint.
    * @param hintElement An object that is the hint element.
    * @param contentElement An object that is the hint's content element.
    * @param titleElement An object that is the hint's title element.
    * @param cancel true, if the action that raised the event should be canceled; otherwise, false.
    */
  def this(targetElement: Any, hintElement: Any, contentElement: Any, titleElement: Any, cancel: Boolean) = this()
  
  /**
    * Gets or sets a value indicating whether the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the object that is the hint's content.
    */
  /* CompleteClass */
  var contentElement: Any = js.native
  
  /**
    * Gets the object that is the hint.
    */
  /* CompleteClass */
  var hintElement: Any = js.native
  
  /**
    * Gets the object that is the hint's target element.
    */
  /* CompleteClass */
  var targetElement: Any = js.native
  
  /**
    * Gets the object that is the hint's title.
    */
  /* CompleteClass */
  var titleElement: Any = js.native
}
