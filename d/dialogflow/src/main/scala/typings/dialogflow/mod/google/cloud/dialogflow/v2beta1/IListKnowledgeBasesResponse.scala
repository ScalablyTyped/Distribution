package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListKnowledgeBasesResponse. */
trait IListKnowledgeBasesResponse extends StObject {
  
  /** ListKnowledgeBasesResponse knowledgeBases */
  var knowledgeBases: js.UndefOr[js.Array[IKnowledgeBase] | Null] = js.undefined
  
  /** ListKnowledgeBasesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListKnowledgeBasesResponse {
  
  inline def apply(): IListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListKnowledgeBasesResponse]
  }
  
  extension [Self <: IListKnowledgeBasesResponse](x: Self) {
    
    inline def setKnowledgeBases(value: js.Array[IKnowledgeBase]): Self = StObject.set(x, "knowledgeBases", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBasesNull: Self = StObject.set(x, "knowledgeBases", null)
    
    inline def setKnowledgeBasesUndefined: Self = StObject.set(x, "knowledgeBases", js.undefined)
    
    inline def setKnowledgeBasesVarargs(value: IKnowledgeBase*): Self = StObject.set(x, "knowledgeBases", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
