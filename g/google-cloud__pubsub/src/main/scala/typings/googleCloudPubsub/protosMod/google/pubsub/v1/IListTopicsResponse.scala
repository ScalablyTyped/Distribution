package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListTopicsResponse. */
trait IListTopicsResponse extends StObject {
  
  /** ListTopicsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListTopicsResponse topics */
  var topics: js.UndefOr[js.Array[ITopic] | Null] = js.undefined
}
object IListTopicsResponse {
  
  inline def apply(): IListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicsResponse]
  }
  
  extension [Self <: IListTopicsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTopics(value: js.Array[ITopic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsNull: Self = StObject.set(x, "topics", null)
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: ITopic*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
