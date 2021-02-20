package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateSnapshotRequest. */
@js.native
trait IUpdateSnapshotRequest extends StObject {
  
  /** UpdateSnapshotRequest snapshot */
  var snapshot: js.UndefOr[ISnapshot | Null] = js.native
  
  /** UpdateSnapshotRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}
object IUpdateSnapshotRequest {
  
  @scala.inline
  def apply(): IUpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateSnapshotRequest]
  }
  
  @scala.inline
  implicit class IUpdateSnapshotRequestMutableBuilder[Self <: IUpdateSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: ISnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
