package typings.devexpressDashWeb

import typings.std.Date
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
  var argumentScaleType: String
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
  var dateTimeArgument: Date
  /**
    * Gets the date-time representation of the data point's value.
    * Value: A date object, representing the point's value.
    */
  var dateTimeValue: Date
  /**
    * Gets the numerical representation of the data point's argument.
    * Value: A Double value, representing the data point's argument.
    */
  var numericalArgument: Double
  /**
    * Gets the numerical representation of the data point's value.
    * Value: A Double value, representing the data point's value.
    */
  var numericalValue: Double
  /**
    * Gets the pane of the diagram point.
    * Value: An ASPxClientXYDiagramPane descendant, representing the pane.
    */
  var pane: ASPxClientXYDiagramPane
  /**
    * Gets the argument of the data point as a text string.
    * Value: A string object, representing a data point's argument.
    */
  var qualitativeArgument: String
  /**
    * Gets the type of the value scale.
    * Value: A string object which contains the current scale type.
    */
  var valueScaleType: String
  /**
    * Gets the value of the client-side axis instance.
    * @param axis An ASPxClientAxisBase class descendant, representing the axis that contains the requested value.
    */
  def GetAxisValue(axis: ASPxClientAxisBase): ASPxClientAxisValue
  /**
    * Checks whether the current object represents a point outside the diagram area.
    */
  def IsEmpty(): Boolean
}

object ASPxClientDiagramCoordinates {
  @scala.inline
  def apply(
    GetAxisValue: ASPxClientAxisBase => ASPxClientAxisValue,
    IsEmpty: () => Boolean,
    argumentScaleType: String,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    dateTimeArgument: Date,
    dateTimeValue: Date,
    numericalArgument: Double,
    numericalValue: Double,
    pane: ASPxClientXYDiagramPane,
    qualitativeArgument: String,
    valueScaleType: String
  ): ASPxClientDiagramCoordinates = {
    val __obj = js.Dynamic.literal(GetAxisValue = js.Any.fromFunction1(GetAxisValue), IsEmpty = js.Any.fromFunction0(IsEmpty), argumentScaleType = argumentScaleType, axisX = axisX, axisY = axisY, dateTimeArgument = dateTimeArgument, dateTimeValue = dateTimeValue, numericalArgument = numericalArgument, numericalValue = numericalValue, pane = pane, qualitativeArgument = qualitativeArgument, valueScaleType = valueScaleType)
  
    __obj.asInstanceOf[ASPxClientDiagramCoordinates]
  }
}

