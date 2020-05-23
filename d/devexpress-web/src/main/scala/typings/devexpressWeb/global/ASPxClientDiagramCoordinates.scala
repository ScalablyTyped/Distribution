package typings.devexpressWeb.global

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the DiagramCoordinates class.
  */
@JSGlobal("ASPxClientDiagramCoordinates")
@js.native
class ASPxClientDiagramCoordinates ()
  extends typings.devexpressWeb.ASPxClientDiagramCoordinates {
  /**
    * Gets the type of the argument scale.
    */
  /* CompleteClass */
  override var argumentScaleType: String = js.native
  /**
    * Gets the X-axis of the diagram point.
    */
  /* CompleteClass */
  override var axisX: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the Y-axis of the diagram point.
    */
  /* CompleteClass */
  override var axisY: typings.devexpressWeb.ASPxClientAxisBase = js.native
  /**
    * Gets the date-time representation of the data point's argument.
    */
  /* CompleteClass */
  override var dateTimeArgument: Date = js.native
  /**
    * Gets the date-time representation of the data point's value.
    */
  /* CompleteClass */
  override var dateTimeValue: Date = js.native
  /**
    * Gets the numerical representation of the data point's argument.
    */
  /* CompleteClass */
  override var numericalArgument: Double = js.native
  /**
    * Gets the numerical representation of the data point's value.
    */
  /* CompleteClass */
  override var numericalValue: Double = js.native
  /**
    * Gets the pane of the diagram point.
    */
  /* CompleteClass */
  override var pane: typings.devexpressWeb.ASPxClientXYDiagramPane = js.native
  /**
    * Gets the argument of the data point as a text string.
    */
  /* CompleteClass */
  override var qualitativeArgument: String = js.native
  /* CompleteClass */
  override var timeSpanArgument: js.Any = js.native
  /* CompleteClass */
  override var timeSpanValue: js.Any = js.native
  /**
    * Gets the type of the value scale.
    */
  /* CompleteClass */
  override var valueScaleType: String = js.native
  /**
    * Gets the value of the client-side axis instance. An ASPxClientAxisValue object that contains the information about the axis scale type and value.
    * @param axis An ASPxClientAxisBase class descendant, representing the axis that contains the requested value.
    */
  /* CompleteClass */
  override def GetAxisValue(axis: typings.devexpressWeb.ASPxClientAxisBase): typings.devexpressWeb.ASPxClientAxisValue = js.native
  /**
    * Checks whether the current object represents a point outside the diagram area.
    */
  /* CompleteClass */
  override def IsEmpty(): Boolean = js.native
}

