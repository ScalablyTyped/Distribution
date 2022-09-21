package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTopicResponse extends StObject {
  
  /**
    * Token identifying the next page of results to return. If empty, no further results are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Topic items that match the request.
    */
  var topic: js.UndefOr[js.Array[SchemaTopic]] = js.undefined
}
object SchemaListTopicResponse {
  
  inline def apply(): SchemaListTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTopicResponse]
  }
  
  extension [Self <: SchemaListTopicResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTopic(value: js.Array[SchemaTopic]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTopicVarargs(value: SchemaTopic*): Self = StObject.set(x, "topic", js.Array(value*))
  }
}
