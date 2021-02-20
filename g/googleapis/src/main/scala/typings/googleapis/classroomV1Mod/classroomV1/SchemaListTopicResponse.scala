package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing topics.
  */
@js.native
trait SchemaListTopicResponse extends StObject {
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Topic items that match the request.
    */
  var topic: js.UndefOr[js.Array[SchemaTopic]] = js.native
}
object SchemaListTopicResponse {
  
  @scala.inline
  def apply(): SchemaListTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicResponse]
  }
  
  @scala.inline
  implicit class SchemaListTopicResponseMutableBuilder[Self <: SchemaListTopicResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTopic(value: js.Array[SchemaTopic]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: SchemaTopic*): Self = StObject.set(x, "topic", js.Array(value :_*))
  }
}
