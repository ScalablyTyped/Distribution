package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRule extends StObject {
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var conditions: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var ins: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var logConfigs: js.UndefOr[js.Array[SchemaLogConfig]] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var notIns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRule {
  
  inline def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  
  extension [Self <: SchemaRule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIns(value: js.Array[String]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
    
    inline def setInsNull: Self = StObject.set(x, "ins", null)
    
    inline def setInsUndefined: Self = StObject.set(x, "ins", js.undefined)
    
    inline def setInsVarargs(value: String*): Self = StObject.set(x, "ins", js.Array(value*))
    
    inline def setLogConfigs(value: js.Array[SchemaLogConfig]): Self = StObject.set(x, "logConfigs", value.asInstanceOf[js.Any])
    
    inline def setLogConfigsUndefined: Self = StObject.set(x, "logConfigs", js.undefined)
    
    inline def setLogConfigsVarargs(value: SchemaLogConfig*): Self = StObject.set(x, "logConfigs", js.Array(value*))
    
    inline def setNotIns(value: js.Array[String]): Self = StObject.set(x, "notIns", value.asInstanceOf[js.Any])
    
    inline def setNotInsNull: Self = StObject.set(x, "notIns", null)
    
    inline def setNotInsUndefined: Self = StObject.set(x, "notIns", js.undefined)
    
    inline def setNotInsVarargs(value: String*): Self = StObject.set(x, "notIns", js.Array(value*))
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
