package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchDeleteEntitiesRequest. */
trait IBatchDeleteEntitiesRequest extends StObject {
  
  /** BatchDeleteEntitiesRequest entityValues */
  var entityValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** BatchDeleteEntitiesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /** BatchDeleteEntitiesRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IBatchDeleteEntitiesRequest {
  
  inline def apply(): IBatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchDeleteEntitiesRequest]
  }
  
  extension [Self <: IBatchDeleteEntitiesRequest](x: Self) {
    
    inline def setEntityValues(value: js.Array[String]): Self = StObject.set(x, "entityValues", value.asInstanceOf[js.Any])
    
    inline def setEntityValuesNull: Self = StObject.set(x, "entityValues", null)
    
    inline def setEntityValuesUndefined: Self = StObject.set(x, "entityValues", js.undefined)
    
    inline def setEntityValuesVarargs(value: String*): Self = StObject.set(x, "entityValues", js.Array(value :_*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
