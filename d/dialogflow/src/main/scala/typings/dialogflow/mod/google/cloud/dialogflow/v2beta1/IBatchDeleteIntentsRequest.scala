package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchDeleteIntentsRequest. */
trait IBatchDeleteIntentsRequest extends StObject {
  
  /** BatchDeleteIntentsRequest intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.undefined
  
  /** BatchDeleteIntentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IBatchDeleteIntentsRequest {
  
  inline def apply(): IBatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchDeleteIntentsRequest]
  }
  
  extension [Self <: IBatchDeleteIntentsRequest](x: Self) {
    
    inline def setIntents(value: js.Array[IIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsNull: Self = StObject.set(x, "intents", null)
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: IIntent*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
