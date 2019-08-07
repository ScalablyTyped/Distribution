package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTrackBar.PositionChanging event.
  */
@JSGlobal("ASPxClientTrackBarPositionChangingEventArgs")
@js.native
class ASPxClientTrackBarPositionChangingEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTrackBarPositionChangingEventArgs object with the specified setting.
    * @param currentPositionStart A Decimal value specifying the current main drag handle position.
    * @param currentPositionEnd A Decimal value specifying the current secondary drag handle position.
    * @param newPositionStart A Decimal value specifying a position where the main drag handle is being moved.
    * @param newPositionEnd A Decimal value specifying a position where the secondary drag handle is being moved.
    */
  def this(
    currentPositionStart: Double,
    currentPositionEnd: Double,
    newPositionStart: Double,
    newPositionEnd: Double
  ) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Gets the current drag handle position.
    */
  var currentPosition: Double = js.native
  /**
    * Gets the current secondary drag handle position.
    */
  var currentPositionEnd: Double = js.native
  /**
    * Gets the current main drag handle position.
    */
  var currentPositionStart: Double = js.native
  /**
    * Gets a position where the drag handle is being moved.
    */
  var newPosition: Double = js.native
  /**
    * Gets a position where the secondary drag handle is being moved.
    */
  var newPositionEnd: Double = js.native
  /**
    * Gets a position where the main drag handle is being moved.
    */
  var newPositionStart: Double = js.native
}

