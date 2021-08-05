package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateKnowledgeBaseRequest. */
trait ICreateKnowledgeBaseRequest extends StObject {
  
  /** CreateKnowledgeBaseRequest knowledgeBase */
  var knowledgeBase: js.UndefOr[IKnowledgeBase | Null] = js.undefined
  
  /** CreateKnowledgeBaseRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateKnowledgeBaseRequest {
  
  inline def apply(): ICreateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateKnowledgeBaseRequest]
  }
  
  extension [Self <: ICreateKnowledgeBaseRequest](x: Self) {
    
    inline def setKnowledgeBase(value: IKnowledgeBase): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseNull: Self = StObject.set(x, "knowledgeBase", null)
    
    inline def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
