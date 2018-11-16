package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValuesRemovedEvent[V]
  extends BaseModelEvent
     with ScalablyTyped.runtime.Instantiable11[
      /* target */ CollaborativeObject, 
      /* sessionId */ java.lang.String, 
      /* userId */ java.lang.String, 
      /* compoundOperationNames */ js.Array[java.lang.String], 
      /* isLocal */ scala.Boolean, 
      /* isUndo */ scala.Boolean, 
      /* isRedo */ scala.Boolean, 
      /* index */ scala.Double, 
      /* values */ js.Array[V], 
      /* movedToList */ CollaborativeList[V], 
      /* movedToIndex */ scala.Double, 
      ValuesRemovedEvent[V]
    ] {
  // The index of the first removed value.
  var index: scala.Double = js.native
  // The index in the collaborative list that the values were moved to, or null if this delete is not the result of a move operation.
  var movedToIndex: scala.Double = js.native
  // The collaborative list that the values were moved to, or null if this delete is not the result of a move operation.
  var movedToList: CollaborativeList[V] = js.native
}

