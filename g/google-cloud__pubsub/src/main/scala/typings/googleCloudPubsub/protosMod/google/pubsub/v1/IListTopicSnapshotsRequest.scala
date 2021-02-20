package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListTopicSnapshotsRequest. */
@js.native
trait IListTopicSnapshotsRequest extends StObject {
  
  /** ListTopicSnapshotsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.native
  
  /** ListTopicSnapshotsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.native
  
  /** ListTopicSnapshotsRequest topic */
  var topic: js.UndefOr[String | Null] = js.native
}
object IListTopicSnapshotsRequest {
  
  @scala.inline
  def apply(): IListTopicSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicSnapshotsRequest]
  }
  
  @scala.inline
  implicit class IListTopicSnapshotsRequestMutableBuilder[Self <: IListTopicSnapshotsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNull: Self = StObject.set(x, "topic", null)
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
