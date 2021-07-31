package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSnapshotsResponse. */
trait IListSnapshotsResponse extends StObject {
  
  /** ListSnapshotsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListSnapshotsResponse snapshots */
  var snapshots: js.UndefOr[js.Array[ISnapshot] | Null] = js.undefined
}
object IListSnapshotsResponse {
  
  @scala.inline
  def apply(): IListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSnapshotsResponse]
  }
  
  @scala.inline
  implicit class IListSnapshotsResponseMutableBuilder[Self <: IListSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSnapshots(value: js.Array[ISnapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsNull: Self = StObject.set(x, "snapshots", null)
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: ISnapshot*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
