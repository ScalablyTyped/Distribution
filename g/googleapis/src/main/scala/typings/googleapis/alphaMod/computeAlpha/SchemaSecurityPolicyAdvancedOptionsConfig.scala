package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyAdvancedOptionsConfig extends StObject {
  
  /**
    * Custom configuration to apply the JSON parsing. Only applicable when json_parsing is set to STANDARD.
    */
  var jsonCustomConfig: js.UndefOr[SchemaSecurityPolicyAdvancedOptionsConfigJsonCustomConfig] = js.undefined
  
  var jsonParsing: js.UndefOr[String | Null] = js.undefined
  
  var logLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyAdvancedOptionsConfig {
  
  inline def apply(): SchemaSecurityPolicyAdvancedOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAdvancedOptionsConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyAdvancedOptionsConfig](x: Self) {
    
    inline def setJsonCustomConfig(value: SchemaSecurityPolicyAdvancedOptionsConfigJsonCustomConfig): Self = StObject.set(x, "jsonCustomConfig", value.asInstanceOf[js.Any])
    
    inline def setJsonCustomConfigUndefined: Self = StObject.set(x, "jsonCustomConfig", js.undefined)
    
    inline def setJsonParsing(value: String): Self = StObject.set(x, "jsonParsing", value.asInstanceOf[js.Any])
    
    inline def setJsonParsingNull: Self = StObject.set(x, "jsonParsing", null)
    
    inline def setJsonParsingUndefined: Self = StObject.set(x, "jsonParsing", js.undefined)
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelNull: Self = StObject.set(x, "logLevel", null)
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
  }
}
