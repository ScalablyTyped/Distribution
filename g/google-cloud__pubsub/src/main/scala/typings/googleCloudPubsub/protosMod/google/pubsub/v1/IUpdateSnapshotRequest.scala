package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateSnapshotRequest. */
trait IUpdateSnapshotRequest extends StObject {
  
  /** UpdateSnapshotRequest snapshot */
  var snapshot: js.UndefOr[ISnapshot | Null] = js.undefined
  
  /** UpdateSnapshotRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateSnapshotRequest {
  
  inline def apply(): IUpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateSnapshotRequest]
  }
  
  extension [Self <: IUpdateSnapshotRequest](x: Self) {
    
    inline def setSnapshot(value: ISnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
