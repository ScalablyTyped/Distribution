package typings.firebaseFirestore.srcLocalIndexeddbSchemaMod

import typings.firebaseFirestore.srcCoreTypesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbTargetGlobal extends StObject {
  
  /**
    * The highest numbered lastListenSequenceNumber across all targets.
    *
    * See DbTarget.lastListenSequenceNumber.
    */
  var highestListenSequenceNumber: Double
  
  /**
    * The highest numbered target id across all targets.
    *
    * See DbTarget.targetId.
    */
  var highestTargetId: TargetId
  
  /**
    * A global snapshot version representing the last consistent snapshot we
    * received from the backend. This is monotonically increasing and any
    * snapshots received from the backend prior to this version (e.g. for
    * targets resumed with a resumeToken) should be suppressed (buffered)
    * until the backend has caught up to this snapshot version again. This
    * prevents our cache from ever going backwards in time.
    */
  var lastRemoteSnapshotVersion: DbTimestamp
  
  /**
    * The number of targets persisted.
    */
  var targetCount: Double
}
object DbTargetGlobal {
  
  inline def apply(
    highestListenSequenceNumber: Double,
    highestTargetId: TargetId,
    lastRemoteSnapshotVersion: DbTimestamp,
    targetCount: Double
  ): DbTargetGlobal = {
    val __obj = js.Dynamic.literal(highestListenSequenceNumber = highestListenSequenceNumber.asInstanceOf[js.Any], highestTargetId = highestTargetId.asInstanceOf[js.Any], lastRemoteSnapshotVersion = lastRemoteSnapshotVersion.asInstanceOf[js.Any], targetCount = targetCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbTargetGlobal]
  }
  
  extension [Self <: DbTargetGlobal](x: Self) {
    
    inline def setHighestListenSequenceNumber(value: Double): Self = StObject.set(x, "highestListenSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setHighestTargetId(value: TargetId): Self = StObject.set(x, "highestTargetId", value.asInstanceOf[js.Any])
    
    inline def setLastRemoteSnapshotVersion(value: DbTimestamp): Self = StObject.set(x, "lastRemoteSnapshotVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetCount(value: Double): Self = StObject.set(x, "targetCount", value.asInstanceOf[js.Any])
  }
}
