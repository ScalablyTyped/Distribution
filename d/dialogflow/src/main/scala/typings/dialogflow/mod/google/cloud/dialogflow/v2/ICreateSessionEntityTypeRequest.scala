package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateSessionEntityTypeRequest. */
trait ICreateSessionEntityTypeRequest extends StObject {
  
  /** CreateSessionEntityTypeRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** CreateSessionEntityTypeRequest sessionEntityType */
  var sessionEntityType: js.UndefOr[ISessionEntityType | Null] = js.undefined
}
object ICreateSessionEntityTypeRequest {
  
  @scala.inline
  def apply(): ICreateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateSessionEntityTypeRequest]
  }
  
  @scala.inline
  implicit class ICreateSessionEntityTypeRequestMutableBuilder[Self <: ICreateSessionEntityTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setSessionEntityType(value: ISessionEntityType): Self = StObject.set(x, "sessionEntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEntityTypeNull: Self = StObject.set(x, "sessionEntityType", null)
    
    @scala.inline
    def setSessionEntityTypeUndefined: Self = StObject.set(x, "sessionEntityType", js.undefined)
  }
}
