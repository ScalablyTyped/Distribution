package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SeekRequest. */
@js.native
trait ISeekRequest extends StObject {
  
  /** SeekRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.native
  
  /** SeekRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
  
  /** SeekRequest time */
  var time: js.UndefOr[ITimestamp | Null] = js.native
}
object ISeekRequest {
  
  @scala.inline
  def apply(): ISeekRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeekRequest]
  }
  
  @scala.inline
  implicit class ISeekRequestMutableBuilder[Self <: ISeekRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setTime(value: ITimestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeNull: Self = StObject.set(x, "time", null)
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
