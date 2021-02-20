package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetTopicRequest. */
@js.native
trait IGetTopicRequest extends StObject {
  
  /** GetTopicRequest topic */
  var topic: js.UndefOr[String | Null] = js.native
}
object IGetTopicRequest {
  
  @scala.inline
  def apply(): IGetTopicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetTopicRequest]
  }
  
  @scala.inline
  implicit class IGetTopicRequestMutableBuilder[Self <: IGetTopicRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNull: Self = StObject.set(x, "topic", null)
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
