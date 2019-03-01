package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events raised in response to changing the widget's options.
  */
trait BootstrapUIWidgetOptionChangedEventArgs extends BootstrapUIWidgetEventArgsBase {
  /**
    * The option's full name.
    * Value: A string value specifying the option's full name.
    */
  var fullName: java.lang.String
  /**
    * The option's short name.
    * Value: A string value specifying the option's short name.
    */
  var name: java.lang.String
  /**
    * The option's old value.
    * Value: An object that is the option's old value.
    */
  var previousValue: js.Object
  /**
    * The option's new value.
    * Value: An object that is the option's new value.
    */
  var value: js.Object
}

object BootstrapUIWidgetOptionChangedEventArgs {
  @scala.inline
  def apply(
    component: js.Object,
    element: js.Object,
    fullName: java.lang.String,
    name: java.lang.String,
    previousValue: js.Object,
    value: js.Object
  ): BootstrapUIWidgetOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("previousValue")(previousValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BootstrapUIWidgetOptionChangedEventArgs]
  }
}

