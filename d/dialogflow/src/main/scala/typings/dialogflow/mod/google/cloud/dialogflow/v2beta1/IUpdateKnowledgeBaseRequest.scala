package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateKnowledgeBaseRequest. */
trait IUpdateKnowledgeBaseRequest extends StObject {
  
  /** UpdateKnowledgeBaseRequest knowledgeBase */
  var knowledgeBase: js.UndefOr[IKnowledgeBase | Null] = js.undefined
  
  /** UpdateKnowledgeBaseRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateKnowledgeBaseRequest {
  
  inline def apply(): IUpdateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateKnowledgeBaseRequest]
  }
  
  extension [Self <: IUpdateKnowledgeBaseRequest](x: Self) {
    
    inline def setKnowledgeBase(value: IKnowledgeBase): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseNull: Self = StObject.set(x, "knowledgeBase", null)
    
    inline def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
