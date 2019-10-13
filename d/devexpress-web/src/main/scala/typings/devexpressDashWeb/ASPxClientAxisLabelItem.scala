package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisLabelItem class.
  */
@JSGlobal("ASPxClientAxisLabelItem")
@js.native
class ASPxClientAxisLabelItem () extends ASPxClientWebChartElement {
  /**
    * Gets the axis to which an axis label item belongs.
    */
  var axis: ASPxClientAxisBase = js.native
  /**
    * Gets the axis value to which an axis label item corresponds.
    */
  var axisValue: js.Any = js.native
  /**
    * Gets the internal representation of the axis value to which an axis label item corresponds.
    */
  var axisValueInternal: Double = js.native
  /**
    * Gets the text of an axis label item.
    */
  var text: String = js.native
}

