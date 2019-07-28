package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events raised in response to widget errors.
  */
trait BootstrapUIWidgetErrorEventArgs extends BootstrapUIWidgetEventArgsBase {
  /**
    * Contains information on the error that occurred.
    * Value: An object containing information on the error that occurred.
    */
  var target: js.Object
}

object BootstrapUIWidgetErrorEventArgs {
  @scala.inline
  def apply(component: js.Object, element: js.Object, target: js.Object): BootstrapUIWidgetErrorEventArgs = {
    val __obj = js.Dynamic.literal(component = component, element = element, target = target)
  
    __obj.asInstanceOf[BootstrapUIWidgetErrorEventArgs]
  }
}

