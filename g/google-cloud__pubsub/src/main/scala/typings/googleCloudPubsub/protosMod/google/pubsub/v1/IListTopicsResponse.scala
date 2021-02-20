package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListTopicsResponse. */
@js.native
trait IListTopicsResponse extends StObject {
  
  /** ListTopicsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
  
  /** ListTopicsResponse topics */
  var topics: js.UndefOr[js.Array[ITopic] | Null] = js.native
}
object IListTopicsResponse {
  
  @scala.inline
  def apply(): IListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListTopicsResponse]
  }
  
  @scala.inline
  implicit class IListTopicsResponseMutableBuilder[Self <: IListTopicsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTopics(value: js.Array[ITopic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsNull: Self = StObject.set(x, "topics", null)
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: ITopic*): Self = StObject.set(x, "topics", js.Array(value :_*))
  }
}
