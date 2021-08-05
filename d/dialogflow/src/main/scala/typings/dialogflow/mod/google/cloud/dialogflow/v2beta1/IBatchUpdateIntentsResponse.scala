package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchUpdateIntentsResponse. */
trait IBatchUpdateIntentsResponse extends StObject {
  
  /** BatchUpdateIntentsResponse intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.undefined
}
object IBatchUpdateIntentsResponse {
  
  inline def apply(): IBatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateIntentsResponse]
  }
  
  extension [Self <: IBatchUpdateIntentsResponse](x: Self) {
    
    inline def setIntents(value: js.Array[IIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsNull: Self = StObject.set(x, "intents", null)
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: IIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
