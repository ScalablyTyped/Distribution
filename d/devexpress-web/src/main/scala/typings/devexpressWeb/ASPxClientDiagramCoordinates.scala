package typings.devexpressWeb

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
    */
  var argumentScaleType: String
  /**
    * Gets the X-axis of the diagram point.
    */
  var axisX: ASPxClientAxisBase
  /**
    * Gets the Y-axis of the diagram point.
    */
  var axisY: ASPxClientAxisBase
  /**
    * Gets the date-time representation of the data point's argument.
    */
  var dateTimeArgument: Date
  /**
    * Gets the date-time representation of the data point's value.
    */
  var dateTimeValue: Date
  /**
    * Gets the numerical representation of the data point's argument.
    */
  var numericalArgument: Double
  /**
    * Gets the numerical representation of the data point's value.
    */
  var numericalValue: Double
  /**
    * Gets the pane of the diagram point.
    */
  var pane: ASPxClientXYDiagramPane
  /**
    * Gets the argument of the data point as a text string.
    */
  var qualitativeArgument: String
  var timeSpanArgument: js.Any
  var timeSpanValue: js.Any
  /**
    * Gets the type of the value scale.
    */
  var valueScaleType: String
  /**
    * Gets the value of the client-side axis instance. An ASPxClientAxisValue object that contains the information about the axis scale type and value.
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
    timeSpanArgument: js.Any,
    timeSpanValue: js.Any,
    valueScaleType: String
  ): ASPxClientDiagramCoordinates = {
    val __obj = js.Dynamic.literal(GetAxisValue = js.Any.fromFunction1(GetAxisValue), IsEmpty = js.Any.fromFunction0(IsEmpty), argumentScaleType = argumentScaleType.asInstanceOf[js.Any], axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], dateTimeArgument = dateTimeArgument.asInstanceOf[js.Any], dateTimeValue = dateTimeValue.asInstanceOf[js.Any], numericalArgument = numericalArgument.asInstanceOf[js.Any], numericalValue = numericalValue.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], qualitativeArgument = qualitativeArgument.asInstanceOf[js.Any], timeSpanArgument = timeSpanArgument.asInstanceOf[js.Any], timeSpanValue = timeSpanValue.asInstanceOf[js.Any], valueScaleType = valueScaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramCoordinates]
  }
}

