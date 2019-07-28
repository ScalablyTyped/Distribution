package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the Hiding event.
  */
trait ASPxClientHintHidingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the event should be canceled.
    * Value: true, if the event should be canceled; otherwise, false.
    */
  var cancel: Boolean
  /**
    * Gets the object that is the hint's content.
    * Value: An object representing the hint's content element related to the event.
    */
  var contentElement: js.Object
  /**
    * Gets the object that is the hint element.
    * Value: An object representing the hint related to the event.
    */
  var hintElement: js.Object
  /**
    * Gets the object that is the hint's target element.
    * Value: An object representing the hint's target element.
    */
  var targetElement: js.Object
  /**
    * Gets the object that is the hint's title.
    * Value: An object representing the hint's title element related to the event.
    */
  var titleElement: js.Object
}

object ASPxClientHintHidingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    contentElement: js.Object,
    hintElement: js.Object,
    targetElement: js.Object,
    titleElement: js.Object
  ): ASPxClientHintHidingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, contentElement = contentElement, hintElement = hintElement, targetElement = targetElement, titleElement = titleElement)
  
    __obj.asInstanceOf[ASPxClientHintHidingEventArgs]
  }
}

