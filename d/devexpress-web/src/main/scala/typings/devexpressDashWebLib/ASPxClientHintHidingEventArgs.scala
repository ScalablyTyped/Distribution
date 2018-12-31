package typings
package devexpressDashWebLib

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
  var cancel: scala.Boolean
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

