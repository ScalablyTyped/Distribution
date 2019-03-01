package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events related to actions performed on the widget's visual elements.
  */
trait BootstrapUIWidgetElementActionEventArgs extends BootstrapUIWidgetEventArgsBase {
  /**
    * The DOM element that initiated the event.
    * Value: An object that initiated the event.
    */
  var target: js.Object
}

object BootstrapUIWidgetElementActionEventArgs {
  @scala.inline
  def apply(component: js.Object, element: js.Object, target: js.Object): BootstrapUIWidgetElementActionEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[BootstrapUIWidgetElementActionEventArgs]
  }
}

