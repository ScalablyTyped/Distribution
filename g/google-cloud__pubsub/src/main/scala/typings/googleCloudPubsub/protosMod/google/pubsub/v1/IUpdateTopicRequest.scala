package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateTopicRequest. */
trait IUpdateTopicRequest extends StObject {
  
  /** UpdateTopicRequest topic */
  var topic: js.UndefOr[ITopic | Null] = js.undefined
  
  /** UpdateTopicRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateTopicRequest {
  
  inline def apply(): IUpdateTopicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateTopicRequest]
  }
  
  extension [Self <: IUpdateTopicRequest](x: Self) {
    
    inline def setTopic(value: ITopic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
