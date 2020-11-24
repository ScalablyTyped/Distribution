package typings.googleDriveRealtimeApi.gapi.drive.realtime

import org.scalablytyped.runtime.Instantiable11
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValuesAddedEvent[V]
  extends BaseModelEvent
     with Instantiable11[
      /* target */ CollaborativeObject, 
      /* sessionId */ String, 
      /* userId */ String, 
      /* compoundOperationNames */ js.Array[String], 
      /* isLocal */ Boolean, 
      /* isUndo */ Boolean, 
      /* isRedo */ Boolean, 
      /* index */ Double, 
      /* values */ js.Array[V], 
      /* movedFromList */ CollaborativeList[V], 
      /* movedFromIndex */ Double, 
      ValuesAddedEvent[V]
    ] {
  
  // The index of the first added value
  var index: Double = js.native
  
  // The index in the source collaborative list that the values were moved from, or null if this insert is not the result of a move operation.
  var movedFromIndex: Double = js.native
  
  // The collaborative list that the values were moved from, or null if this insertion is not the result of a move operation.
  var movedFromList: CollaborativeList[V] = js.native
}
