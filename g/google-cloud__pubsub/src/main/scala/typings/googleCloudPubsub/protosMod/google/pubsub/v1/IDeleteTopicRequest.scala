package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteTopicRequest. */
trait IDeleteTopicRequest extends StObject {
  
  /** DeleteTopicRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object IDeleteTopicRequest {
  
  inline def apply(): IDeleteTopicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteTopicRequest]
  }
  
  extension [Self <: IDeleteTopicRequest](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
