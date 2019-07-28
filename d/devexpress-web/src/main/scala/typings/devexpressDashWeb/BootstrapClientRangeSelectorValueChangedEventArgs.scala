package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on the selected range.
  */
trait BootstrapClientRangeSelectorValueChangedEventArgs extends BootstrapUIWidgetEventArgsBase {
  /**
    * The previous value of a RangeSelector control.
    * Value: A System.Object type defining the previous value specified for a RangeSelector control.
    */
  var previousValue: js.Object
  /**
    * The value currently specified for the RangeSelector control.
    * Value: A System.Object instance defining the current value specified for a RangeSelector control.
    */
  var value: js.Object
}

object BootstrapClientRangeSelectorValueChangedEventArgs {
  @scala.inline
  def apply(component: js.Object, element: js.Object, previousValue: js.Object, value: js.Object): BootstrapClientRangeSelectorValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(component = component, element = element, previousValue = previousValue, value = value)
  
    __obj.asInstanceOf[BootstrapClientRangeSelectorValueChangedEventArgs]
  }
}

