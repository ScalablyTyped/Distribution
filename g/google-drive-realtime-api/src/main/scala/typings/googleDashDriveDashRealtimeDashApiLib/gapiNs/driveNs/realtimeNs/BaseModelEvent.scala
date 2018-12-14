package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
org.scalablytyped.runtime.Instantiable7[
      /* target */ CollaborativeObject, 
      /* sessionId */ java.lang.String, 
      /* userId */ java.lang.String, 
      /* compoundOperationNames */ js.Array[java.lang.String], 
      /* isLocal */ scala.Boolean, 
      /* isUndo */ scala.Boolean, 
      /* isRedo */ scala.Boolean, 
      BaseModelEvent
    ] {
  // Whether this event bubbles.
  var bubbles: scala.Boolean = js.native
  // The list of names from the hierarchy of compound operations that initiated this event.
  var compoundOperationNames: js.Array[java.lang.String] = js.native
  // True if this event originated in the local session.
  var isLocal: scala.Boolean = js.native
  // True if this event originated from a redo call.
  var isRedo: scala.Boolean = js.native
  // True if this event originated from an undo call.
  var isUndo: scala.Boolean = js.native
  // The id of the session that initiated this event.
  var sessionId: java.lang.String = js.native
  // The collaborative object that initiated this event.
  var target: CollaborativeObject = js.native
  // The type of the event.
  var `type`: EventType = js.native
  // The user id of the user that initiated this event.
  var userId: java.lang.String = js.native
  // Prevents an event from performing its default action. In the Realtime API, this function is only present
  // for compatibility with the DOM event interface and therefore it does nothing.
  def preventDefault(): scala.Unit = js.native
  // Stops an event which bubbles from propagating to the target's parent.
  def stopPropagation(): scala.Unit = js.native
}

