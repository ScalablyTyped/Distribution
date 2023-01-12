package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteKnowledgeBaseRequest. */
trait IDeleteKnowledgeBaseRequest extends StObject {
  
  /** DeleteKnowledgeBaseRequest force */
  var force: js.UndefOr[Boolean | Null] = js.undefined
  
  /** DeleteKnowledgeBaseRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteKnowledgeBaseRequest {
  
  inline def apply(): IDeleteKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteKnowledgeBaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDeleteKnowledgeBaseRequest] (val x: Self) extends AnyVal {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceNull: Self = StObject.set(x, "force", null)
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
