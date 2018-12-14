package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectChangedEvent
  extends BaseModelEvent
     with // parameters as in BaseModelEvent above except for addition of:
// events:
// Array of gapi.drive.realtime.BaseModelEvent
// The specific events that document the changes that occurred on the object.
// Value must not be null.
org.scalablytyped.runtime.Instantiable8[
      /* target */ CollaborativeObject, 
      /* sessionId */ java.lang.String, 
      /* userId */ java.lang.String, 
      /* compoundOperationNames */ js.Array[java.lang.String], 
      /* isLocal */ scala.Boolean, 
      /* isUndo */ scala.Boolean, 
      /* isRedo */ scala.Boolean, 
      /* events */ js.Array[BaseModelEvent], 
      ObjectChangedEvent
    ] {
  // The specific events that document the changes that occurred on the object.
  var events: js.Array[BaseModelEvent] = js.native
}

