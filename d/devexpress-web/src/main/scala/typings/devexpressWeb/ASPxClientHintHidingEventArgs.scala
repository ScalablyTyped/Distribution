package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHint.Hiding event.
  */
trait ASPxClientHintHidingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value indicating whether the event should be canceled.
    */
  var cancel: Boolean
  /**
    * Gets the object that is the hint's content.
    */
  var contentElement: js.Any
  /**
    * Gets the object that is the hint element.
    */
  var hintElement: js.Any
  /**
    * Gets the object that is the hint's target element.
    */
  var targetElement: js.Any
  /**
    * Gets the object that is the hint's title.
    */
  var titleElement: js.Any
}

object ASPxClientHintHidingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    contentElement: js.Any,
    hintElement: js.Any,
    targetElement: js.Any,
    titleElement: js.Any
  ): ASPxClientHintHidingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], contentElement = contentElement.asInstanceOf[js.Any], hintElement = hintElement.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], titleElement = titleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHintHidingEventArgs]
  }
}

