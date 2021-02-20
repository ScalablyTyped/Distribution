package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateKnowledgeBaseRequest. */
@js.native
trait IUpdateKnowledgeBaseRequest extends StObject {
  
  /** UpdateKnowledgeBaseRequest knowledgeBase */
  var knowledgeBase: js.UndefOr[IKnowledgeBase | Null] = js.native
  
  /** UpdateKnowledgeBaseRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}
object IUpdateKnowledgeBaseRequest {
  
  @scala.inline
  def apply(): IUpdateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateKnowledgeBaseRequest]
  }
  
  @scala.inline
  implicit class IUpdateKnowledgeBaseRequestMutableBuilder[Self <: IUpdateKnowledgeBaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnowledgeBase(value: IKnowledgeBase): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeBaseNull: Self = StObject.set(x, "knowledgeBase", null)
    
    @scala.inline
    def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
