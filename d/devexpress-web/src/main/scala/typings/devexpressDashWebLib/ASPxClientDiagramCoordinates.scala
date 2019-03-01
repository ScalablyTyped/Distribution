package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the DiagramCoordinates class.
  */
trait ASPxClientDiagramCoordinates extends js.Object {
  /**
    * Gets the type of the argument scale.
    * Value: A string object which contains the current scale type.
    */
  var argumentScaleType: java.lang.String
  /**
    * Gets the X-axis of the diagram point.
    * Value: An ASPxClientAxisBase descendant, representing the axis of arguments (X-axis).
    */
  var axisX: ASPxClientAxisBase
  /**
    * Gets the Y-axis of the diagram point.
    * Value: An ASPxClientAxisBase descendant, representing the axis of values (Y-axis).
    */
  var axisY: ASPxClientAxisBase
  /**
    * Gets the date-time representation of the data point's argument.
    * Value: A date object, representing the point's argument.
    */
  var dateTimeArgument: stdLib.Date
  /**
    * Gets the date-time representation of the data point's value.
    * Value: A date object, representing the point's value.
    */
  var dateTimeValue: stdLib.Date
  /**
    * Gets the numerical representation of the data point's argument.
    * Value: A Double value, representing the data point's argument.
    */
  var numericalArgument: scala.Double
  /**
    * Gets the numerical representation of the data point's value.
    * Value: A Double value, representing the data point's value.
    */
  var numericalValue: scala.Double
  /**
    * Gets the pane of the diagram point.
    * Value: An ASPxClientXYDiagramPane descendant, representing the pane.
    */
  var pane: ASPxClientXYDiagramPane
  /**
    * Gets the argument of the data point as a text string.
    * Value: A string object, representing a data point's argument.
    */
  var qualitativeArgument: java.lang.String
  /**
    * Gets the type of the value scale.
    * Value: A string object which contains the current scale type.
    */
  var valueScaleType: java.lang.String
  /**
    * Gets the value of the client-side axis instance.
    * @param axis An ASPxClientAxisBase class descendant, representing the axis that contains the requested value.
    */
  def GetAxisValue(axis: ASPxClientAxisBase): ASPxClientAxisValue
  /**
    * Checks whether the current object represents a point outside the diagram area.
    */
  def IsEmpty(): scala.Boolean
}

object ASPxClientDiagramCoordinates {
  @scala.inline
  def apply(
    GetAxisValue: js.Function1[ASPxClientAxisBase, ASPxClientAxisValue],
    IsEmpty: js.Function0[scala.Boolean],
    argumentScaleType: java.lang.String,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    dateTimeArgument: stdLib.Date,
    dateTimeValue: stdLib.Date,
    numericalArgument: scala.Double,
    numericalValue: scala.Double,
    pane: ASPxClientXYDiagramPane,
    qualitativeArgument: java.lang.String,
    valueScaleType: java.lang.String
  ): ASPxClientDiagramCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAxisValue")(GetAxisValue)
    __obj.updateDynamic("IsEmpty")(IsEmpty)
    __obj.updateDynamic("argumentScaleType")(argumentScaleType)
    __obj.updateDynamic("axisX")(axisX)
    __obj.updateDynamic("axisY")(axisY)
    __obj.updateDynamic("dateTimeArgument")(dateTimeArgument)
    __obj.updateDynamic("dateTimeValue")(dateTimeValue)
    __obj.updateDynamic("numericalArgument")(numericalArgument)
    __obj.updateDynamic("numericalValue")(numericalValue)
    __obj.updateDynamic("pane")(pane)
    __obj.updateDynamic("qualitativeArgument")(qualitativeArgument)
    __obj.updateDynamic("valueScaleType")(valueScaleType)
    __obj.asInstanceOf[ASPxClientDiagramCoordinates]
  }
}

