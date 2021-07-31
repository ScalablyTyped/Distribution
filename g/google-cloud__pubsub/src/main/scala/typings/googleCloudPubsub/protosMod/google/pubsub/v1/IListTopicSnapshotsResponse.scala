package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListTopicSnapshotsResponse. */
trait IListTopicSnapshotsResponse extends StObject {
  
  /** ListTopicSnapshotsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListTopicSnapshotsResponse snapshots */
  var snapshots: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IListTopicSnapshotsResponse {
  
  @scala.inline
  def apply(): IListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicSnapshotsResponse]
  }
  
  @scala.inline
  implicit class IListTopicSnapshotsResponseMutableBuilder[Self <: IListTopicSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSnapshots(value: js.Array[String]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsNull: Self = StObject.set(x, "snapshots", null)
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: String*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
