package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateKnowledgeBaseRequest. */
@js.native
trait ICreateKnowledgeBaseRequest extends StObject {
  
  /** CreateKnowledgeBaseRequest knowledgeBase */
  var knowledgeBase: js.UndefOr[IKnowledgeBase | Null] = js.native
  
  /** CreateKnowledgeBaseRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object ICreateKnowledgeBaseRequest {
  
  @scala.inline
  def apply(): ICreateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateKnowledgeBaseRequest]
  }
  
  @scala.inline
  implicit class ICreateKnowledgeBaseRequestMutableBuilder[Self <: ICreateKnowledgeBaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnowledgeBase(value: IKnowledgeBase): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeBaseNull: Self = StObject.set(x, "knowledgeBase", null)
    
    @scala.inline
    def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
