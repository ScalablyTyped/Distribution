package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PublishResponse. */
trait IPublishResponse extends StObject {
  
  /** PublishResponse messageIds */
  var messageIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IPublishResponse {
  
  inline def apply(): IPublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPublishResponse]
  }
  
  extension [Self <: IPublishResponse](x: Self) {
    
    inline def setMessageIds(value: js.Array[String]): Self = StObject.set(x, "messageIds", value.asInstanceOf[js.Any])
    
    inline def setMessageIdsNull: Self = StObject.set(x, "messageIds", null)
    
    inline def setMessageIdsUndefined: Self = StObject.set(x, "messageIds", js.undefined)
    
    inline def setMessageIdsVarargs(value: String*): Self = StObject.set(x, "messageIds", js.Array(value*))
  }
}
