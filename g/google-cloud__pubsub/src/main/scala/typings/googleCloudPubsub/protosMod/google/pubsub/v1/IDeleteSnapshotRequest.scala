package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteSnapshotRequest. */
trait IDeleteSnapshotRequest extends StObject {
  
  /** DeleteSnapshotRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.undefined
}
object IDeleteSnapshotRequest {
  
  inline def apply(): IDeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteSnapshotRequest]
  }
  
  extension [Self <: IDeleteSnapshotRequest](x: Self) {
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}
