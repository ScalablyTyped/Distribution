package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisLabelItem class.
  */
trait ASPxClientAxisLabelItem extends ASPxClientWebChartElement {
  /**
    * Gets the axis to which an axis label item belongs.
    * Value: An ASPxClientAxisBase descendant, which identifies the axis.
    */
  var axis: ASPxClientAxisBase
  /**
    * Gets the axis value to which an axis label item corresponds.
    * Value: An object that specifies the axis value.
    */
  var axisValue: js.Object
  /**
    * Gets the internal representation of the axis value to which an axis label item corresponds.
    * Value: A Double value which specifies the internal representation of the axis value.
    */
  var axisValueInternal: scala.Double
  /**
    * Gets the text of an axis label item.
    * Value: A string object which contains the axis label item's text.
    */
  var text: java.lang.String
}

