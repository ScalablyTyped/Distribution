package typings.googleDashDriveDashRealtimeDashApi.gapiNs.driveNs.realtimeNs

import org.scalablytyped.runtime.Instantiable11
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValuesRemovedEvent[V]
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
      /* movedToList */ CollaborativeList[V], 
      /* movedToIndex */ Double, 
      ValuesRemovedEvent[V]
    ] {
  // The index of the first removed value.
  var index: Double = js.native
  // The index in the collaborative list that the values were moved to, or null if this delete is not the result of a move operation.
  var movedToIndex: Double = js.native
  // The collaborative list that the values were moved to, or null if this delete is not the result of a move operation.
  var movedToList: CollaborativeList[V] = js.native
}

