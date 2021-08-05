package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SeekRequest. */
trait ISeekRequest extends StObject {
  
  /** SeekRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.undefined
  
  /** SeekRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
  
  /** SeekRequest time */
  var time: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ISeekRequest {
  
  inline def apply(): ISeekRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeekRequest]
  }
  
  extension [Self <: ISeekRequest](x: Self) {
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTime(value: ITimestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
