package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
  
  inline def apply(): ICreateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateSessionEntityTypeRequest]
  }
  
  extension [Self <: ICreateSessionEntityTypeRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSessionEntityType(value: ISessionEntityType): Self = StObject.set(x, "sessionEntityType", value.asInstanceOf[js.Any])
    
    inline def setSessionEntityTypeNull: Self = StObject.set(x, "sessionEntityType", null)
    
    inline def setSessionEntityTypeUndefined: Self = StObject.set(x, "sessionEntityType", js.undefined)
  }
}
