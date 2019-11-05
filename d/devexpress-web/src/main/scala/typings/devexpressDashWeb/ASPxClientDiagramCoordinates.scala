package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the DiagramCoordinates class.
  */
@JSGlobal("ASPxClientDiagramCoordinates")
@js.native
class ASPxClientDiagramCoordinates () extends js.Object {
  /**
    * Gets the type of the argument scale.
    */
  var argumentScaleType: String = js.native
  /**
    * Gets the X-axis of the diagram point.
    */
  var axisX: ASPxClientAxisBase = js.native
  /**
    * Gets the Y-axis of the diagram point.
    */
  var axisY: ASPxClientAxisBase = js.native
  /**
    * Gets the date-time representation of the data point's argument.
    */
  var dateTimeArgument: Date = js.native
  /**
    * Gets the date-time representation of the data point's value.
    */
  var dateTimeValue: Date = js.native
  /**
    * Gets the numerical representation of the data point's argument.
    */
  var numericalArgument: Double = js.native
  /**
    * Gets the numerical representation of the data point's value.
    */
  var numericalValue: Double = js.native
  /**
    * Gets the pane of the diagram point.
    */
  var pane: ASPxClientXYDiagramPane = js.native
  /**
    * Gets the argument of the data point as a text string.
    */
  var qualitativeArgument: String = js.native
  var timeSpanArgument: js.Any = js.native
  var timeSpanValue: js.Any = js.native
  /**
    * Gets the type of the value scale.
    */
  var valueScaleType: String = js.native
  /**
    * Gets the value of the client-side axis instance. An ASPxClientAxisValue object that contains the information about the axis scale type and value.
    * @param axis An ASPxClientAxisBase class descendant, representing the axis that contains the requested value.
    */
  def GetAxisValue(axis: ASPxClientAxisBase): ASPxClientAxisValue = js.native
  /**
    * Checks whether the current object represents a point outside the diagram area.
    */
  def IsEmpty(): Boolean = js.native
}

