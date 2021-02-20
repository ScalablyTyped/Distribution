package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListKnowledgeBasesResponse. */
@js.native
trait IListKnowledgeBasesResponse extends StObject {
  
  /** ListKnowledgeBasesResponse knowledgeBases */
  var knowledgeBases: js.UndefOr[js.Array[IKnowledgeBase] | Null] = js.native
  
  /** ListKnowledgeBasesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
}
object IListKnowledgeBasesResponse {
  
  @scala.inline
  def apply(): IListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListKnowledgeBasesResponse]
  }
  
  @scala.inline
  implicit class IListKnowledgeBasesResponseMutableBuilder[Self <: IListKnowledgeBasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnowledgeBases(value: js.Array[IKnowledgeBase]): Self = StObject.set(x, "knowledgeBases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeBasesNull: Self = StObject.set(x, "knowledgeBases", null)
    
    @scala.inline
    def setKnowledgeBasesUndefined: Self = StObject.set(x, "knowledgeBases", js.undefined)
    
    @scala.inline
    def setKnowledgeBasesVarargs(value: IKnowledgeBase*): Self = StObject.set(x, "knowledgeBases", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
