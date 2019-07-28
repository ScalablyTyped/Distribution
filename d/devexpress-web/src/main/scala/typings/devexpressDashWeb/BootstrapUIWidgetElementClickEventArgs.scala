package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client-side clicking events.
  */
trait BootstrapUIWidgetElementClickEventArgs extends BootstrapUIWidgetElementActionEventArgs {
  /**
    * The jQuery event that caused the handler execution.
    * Value: An object of the <a href="http://api.jquery.com/Types/#Event" target="_blank">jQuery.Event</a> type.
    */
  var jQueryEvent: js.Object
}

object BootstrapUIWidgetElementClickEventArgs {
  @scala.inline
  def apply(component: js.Object, element: js.Object, jQueryEvent: js.Object, target: js.Object): BootstrapUIWidgetElementClickEventArgs = {
    val __obj = js.Dynamic.literal(component = component, element = element, jQueryEvent = jQueryEvent, target = target)
  
    __obj.asInstanceOf[BootstrapUIWidgetElementClickEventArgs]
  }
}

