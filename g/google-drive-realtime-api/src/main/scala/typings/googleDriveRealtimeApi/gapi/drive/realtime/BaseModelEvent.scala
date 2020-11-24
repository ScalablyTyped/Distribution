package typings.googleDriveRealtimeApi.gapi.drive.realtime

import org.scalablytyped.runtime.Instantiable7
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseModelEvent
  extends /* Parameters:
  target
  gapi.drive.realtime.CollaborativeObject
  The collaborative object that initiated the event.
  Value must not be null.
  sessionId
  string
  The id of the session that initiated the event.
  userId
  string
  The user id of the user that initiated the event.
  compoundOperationNames
  Array of string
  The list of names from the hierarchy of compound operations that initiated the event.
  Value must not be null.
  isLocal
  boolean
  True if the event originated in the local session.
  isUndo
  boolean
  True if the event originated from an undo call.
  isRedo
  boolean
  True if the event originated from a redo call.
  */
Instantiable7[
      /* target */ CollaborativeObject, 
      /* sessionId */ String, 
      /* userId */ String, 
      /* compoundOperationNames */ js.Array[String], 
      /* isLocal */ Boolean, 
      /* isUndo */ Boolean, 
      /* isRedo */ Boolean, 
      BaseModelEvent
    ] {
  
  // Whether this event bubbles.
  var bubbles: Boolean = js.native
  
  // The list of names from the hierarchy of compound operations that initiated this event.
  var compoundOperationNames: js.Array[String] = js.native
  
  // True if this event originated in the local session.
  var isLocal: Boolean = js.native
  
  // True if this event originated from a redo call.
  var isRedo: Boolean = js.native
  
  // True if this event originated from an undo call.
  var isUndo: Boolean = js.native
  
  // Prevents an event from performing its default action. In the Realtime API, this function is only present
  // for compatibility with the DOM event interface and therefore it does nothing.
  def preventDefault(): Unit = js.native
  
  // The id of the session that initiated this event.
  var sessionId: String = js.native
  
  // Stops an event which bubbles from propagating to the target's parent.
  def stopPropagation(): Unit = js.native
  
  // The collaborative object that initiated this event.
  var target: CollaborativeObject = js.native
  
  // The type of the event.
  var `type`: EventType = js.native
  
  // The user id of the user that initiated this event.
  var userId: String = js.native
}
