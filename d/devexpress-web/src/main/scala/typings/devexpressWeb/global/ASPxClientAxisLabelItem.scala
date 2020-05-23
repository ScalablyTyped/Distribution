package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisLabelItem class.
  */
@JSGlobal("ASPxClientAxisLabelItem")
@js.native
class ASPxClientAxisLabelItem ()
  extends typings.devexpressWeb.ASPxClientAxisLabelItem {
  /**
    * Gets the axis to which an axis label item belongs.
    */
  /* CompleteClass */
  override var axis: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the axis value to which an axis label item corresponds.
    */
  /* CompleteClass */
  override var axisValue: js.Any = js.native
  /**
    * Gets the internal representation of the axis value to which an axis label item corresponds.
    */
  /* CompleteClass */
  override var axisValueInternal: Double = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the text of an axis label item.
    */
  /* CompleteClass */
  override var text: String = js.native
}

