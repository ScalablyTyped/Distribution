package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapRangeSelector control.
  */
@JSGlobal("BootstrapClientRangeSelector")
@js.native
class BootstrapClientRangeSelector () extends BootstrapUIWidgetBase {
  /**
    * Fires after the selected range has been changed by moving one of the sliders.
    */
  var ValueChanged: ASPxClientEvent[
    BootstrapClientRangeSelectorValueChangedEventHandler[BootstrapClientRangeSelector]
  ] = js.native
  /**
    * Gets the Range Selector's selected value range.
    */
  def GetValue(): js.Array[_] = js.native
  /**
    * Gets the Range Selector's selected value range.
    * @param value An array containing the value range.
    */
  def SetValue(value: js.Array[_]): Unit = js.native
}

