package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetSnapshotRequest. */
trait IGetSnapshotRequest extends StObject {
  
  /** GetSnapshotRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.undefined
}
object IGetSnapshotRequest {
  
  inline def apply(): IGetSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetSnapshotRequest]
  }
  
  extension [Self <: IGetSnapshotRequest](x: Self) {
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}
