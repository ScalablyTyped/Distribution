package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTrackBar.PositionChanging event.
  */
@js.native
trait ASPxClientTrackBarPositionChangingEventArgs extends ASPxClientProcessingModeEventArgs {
  
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
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], currentPosition = currentPosition.asInstanceOf[js.Any], currentPositionEnd = currentPositionEnd.asInstanceOf[js.Any], currentPositionStart = currentPositionStart.asInstanceOf[js.Any], newPosition = newPosition.asInstanceOf[js.Any], newPositionEnd = newPositionEnd.asInstanceOf[js.Any], newPositionStart = newPositionStart.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTrackBarPositionChangingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTrackBarPositionChangingEventArgsMutableBuilder[Self <: ASPxClientTrackBarPositionChangingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPosition(value: Double): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPositionEnd(value: Double): Self = StObject.set(x, "currentPositionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPositionStart(value: Double): Self = StObject.set(x, "currentPositionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPosition(value: Double): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPositionEnd(value: Double): Self = StObject.set(x, "newPositionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPositionStart(value: Double): Self = StObject.set(x, "newPositionStart", value.asInstanceOf[js.Any])
  }
}
