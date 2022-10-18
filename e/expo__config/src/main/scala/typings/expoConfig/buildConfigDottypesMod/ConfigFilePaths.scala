package typings.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFilePaths extends StObject {
  
  var dynamicConfigPath: String | Null
  
  var staticConfigPath: String | Null
}
object ConfigFilePaths {
  
  inline def apply(): ConfigFilePaths = {
    val __obj = js.Dynamic.literal(dynamicConfigPath = null, staticConfigPath = null)
    __obj.asInstanceOf[ConfigFilePaths]
  }
  
  extension [Self <: ConfigFilePaths](x: Self) {
    
    inline def setDynamicConfigPath(value: String): Self = StObject.set(x, "dynamicConfigPath", value.asInstanceOf[js.Any])
    
    inline def setDynamicConfigPathNull: Self = StObject.set(x, "dynamicConfigPath", null)
    
    inline def setStaticConfigPath(value: String): Self = StObject.set(x, "staticConfigPath", value.asInstanceOf[js.Any])
    
    inline def setStaticConfigPathNull: Self = StObject.set(x, "staticConfigPath", null)
  }
}
