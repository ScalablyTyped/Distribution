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
  
  @scala.inline
  def apply(): IGetSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetSnapshotRequest]
  }
  
  @scala.inline
  implicit class IGetSnapshotRequestMutableBuilder[Self <: IGetSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}
