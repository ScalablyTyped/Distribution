package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigurationVariables extends StObject {
  
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The variable set that is attributed to the user.
    */
  var variableSet: js.UndefOr[js.Array[SchemaVariableSet]] = js.undefined
}
object SchemaConfigurationVariables {
  
  inline def apply(): SchemaConfigurationVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationVariables]
  }
  
  extension [Self <: SchemaConfigurationVariables](x: Self) {
    
    inline def setMcmId(value: String): Self = StObject.set(x, "mcmId", value.asInstanceOf[js.Any])
    
    inline def setMcmIdNull: Self = StObject.set(x, "mcmId", null)
    
    inline def setMcmIdUndefined: Self = StObject.set(x, "mcmId", js.undefined)
    
    inline def setVariableSet(value: js.Array[SchemaVariableSet]): Self = StObject.set(x, "variableSet", value.asInstanceOf[js.Any])
    
    inline def setVariableSetUndefined: Self = StObject.set(x, "variableSet", js.undefined)
    
    inline def setVariableSetVarargs(value: SchemaVariableSet*): Self = StObject.set(x, "variableSet", js.Array(value*))
  }
}
