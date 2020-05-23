package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides base data for the client-side events.
  */
trait BootstrapUIWidgetEventArgsBase extends ASPxClientEventArgs {
  /**
    * The widget instance.
    */
  var component: js.Any
  /**
    * The widget's container.
    */
  var element: js.Any
}

object BootstrapUIWidgetEventArgsBase {
  @scala.inline
  def apply(component: js.Any, element: js.Any): BootstrapUIWidgetEventArgsBase = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapUIWidgetEventArgsBase]
  }
}

