package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PositionChanging event.
  */
trait ASPxClientTrackBarPositionChangingEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    * Value: true if the action that raised the event should be canceled; otherwise, false.
    */
  var cancel: Boolean
  /**
    * Gets the current drag handle position.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var currentPosition: Double
  /**
    * Gets the current secondary drag handle position.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var currentPositionEnd: Double
  /**
    * Gets the current main drag handle position.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var currentPositionStart: Double
  /**
    * Gets a position where the drag handle is being moved.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var newPosition: Double
  /**
    * Gets a position where the secondary drag handle is being moved.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var newPositionEnd: Double
  /**
    * Gets a position where the main drag handle is being moved.
    * Value: A <see cref="Decimal" /> value that is the drag handle position.
    */
  var newPositionStart: Double
}

object ASPxClientTrackBarPositionChangingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    currentPosition: Double,
    currentPositionEnd: Double,
    currentPositionStart: Double,
    newPosition: Double,
    newPositionEnd: Double,
    newPositionStart: Double,
    processOnServer: Boolean
  ): ASPxClientTrackBarPositionChangingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, currentPosition = currentPosition, currentPositionEnd = currentPositionEnd, currentPositionStart = currentPositionStart, newPosition = newPosition, newPositionEnd = newPositionEnd, newPositionStart = newPositionStart, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientTrackBarPositionChangingEventArgs]
  }
}

