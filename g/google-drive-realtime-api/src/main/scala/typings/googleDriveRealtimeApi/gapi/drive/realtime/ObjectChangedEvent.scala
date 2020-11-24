package typings.googleDriveRealtimeApi.gapi.drive.realtime

import org.scalablytyped.runtime.Instantiable8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectChangedEvent
  extends BaseModelEvent
     with // parameters as in BaseModelEvent above except for addition of:
// events:
// Array of gapi.drive.realtime.BaseModelEvent
// The specific events that document the changes that occurred on the object.
// Value must not be null.
Instantiable8[
      /* target */ CollaborativeObject, 
      /* sessionId */ String, 
      /* userId */ String, 
      /* compoundOperationNames */ js.Array[String], 
      /* isLocal */ Boolean, 
      /* isUndo */ Boolean, 
      /* isRedo */ Boolean, 
      /* events */ js.Array[BaseModelEvent], 
      ObjectChangedEvent
    ] {
  
  // The specific events that document the changes that occurred on the object.
  var events: js.Array[BaseModelEvent] = js.native
}
