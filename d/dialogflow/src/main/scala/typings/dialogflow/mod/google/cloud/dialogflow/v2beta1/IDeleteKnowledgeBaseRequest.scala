package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteKnowledgeBaseRequest. */
@js.native
trait IDeleteKnowledgeBaseRequest extends StObject {
  
  /** DeleteKnowledgeBaseRequest force */
  var force: js.UndefOr[Boolean | Null] = js.native
  
  /** DeleteKnowledgeBaseRequest name */
  var name: js.UndefOr[String | Null] = js.native
}
object IDeleteKnowledgeBaseRequest {
  
  @scala.inline
  def apply(): IDeleteKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteKnowledgeBaseRequest]
  }
  
  @scala.inline
  implicit class IDeleteKnowledgeBaseRequestMutableBuilder[Self <: IDeleteKnowledgeBaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceNull: Self = StObject.set(x, "force", null)
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
