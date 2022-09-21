package typings.googleapis.cloudfunctionsV2Mod.cloudfunctionsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntime extends StObject {
  
  /**
    * The user facing name, eg 'Go 1.13', 'Node.js 12', etc.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The environment for the runtime.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the runtime, e.g., 'go113', 'nodejs12', etc.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stage of life this runtime is in, e.g., BETA, GA, etc.
    */
  var stage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Warning messages, e.g., a deprecation warning.
    */
  var warnings: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRuntime {
  
  inline def apply(): SchemaRuntime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntime]
  }
  
  extension [Self <: SchemaRuntime](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageNull: Self = StObject.set(x, "stage", null)
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
