package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValuesAddedEvent[V]
  extends BaseModelEvent
     with org.scalablytyped.runtime.Instantiable11[
      /* target */ CollaborativeObject, 
      /* sessionId */ java.lang.String, 
      /* userId */ java.lang.String, 
      /* compoundOperationNames */ js.Array[java.lang.String], 
      /* isLocal */ scala.Boolean, 
      /* isUndo */ scala.Boolean, 
      /* isRedo */ scala.Boolean, 
      /* index */ scala.Double, 
      /* values */ js.Array[V], 
      /* movedFromList */ CollaborativeList[V], 
      /* movedFromIndex */ scala.Double, 
      ValuesAddedEvent[V]
    ] {
  // The index of the first added value
  var index: scala.Double = js.native
  // The index in the source collaborative list that the values were moved from, or null if this insert is not the result of a move operation.
  var movedFromIndex: scala.Double = js.native
  // The collaborative list that the values were moved from, or null if this insertion is not the result of a move operation.
  var movedFromList: CollaborativeList[V] = js.native
}

