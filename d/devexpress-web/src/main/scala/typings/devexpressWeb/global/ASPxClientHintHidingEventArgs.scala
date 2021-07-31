package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHint.Hiding event.
  */
@JSGlobal("ASPxClientHintHidingEventArgs")
@js.native
class ASPxClientHintHidingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHintHidingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHintHidingEventArgs class with specified settings.
    * @param targetElement An object that is the target element of the hint.
    * @param hintElement An object that is the hint element.
    * @param contentElement An object that is the hint's content element.
    * @param titleElement An object that is the hint's title element.
    * @param cancel true, if the action that raised the event should be canceled; otherwise, false.
    */
  def this(
    targetElement: js.Any,
    hintElement: js.Any,
    contentElement: js.Any,
    titleElement: js.Any,
    cancel: Boolean
  ) = this()
  
  /**
    * Gets or sets a value indicating whether the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the object that is the hint's content.
    */
  /* CompleteClass */
  var contentElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint element.
    */
  /* CompleteClass */
  var hintElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint's target element.
    */
  /* CompleteClass */
  var targetElement: js.Any = js.native
  
  /**
    * Gets the object that is the hint's title.
    */
  /* CompleteClass */
  var titleElement: js.Any = js.native
}
