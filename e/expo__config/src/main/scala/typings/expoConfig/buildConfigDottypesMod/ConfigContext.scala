package typings.expoConfig.buildConfigDottypesMod

import typings.expoConfig.anon.PartialExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigContext extends StObject {
  
  var config: PartialExpoConfig
  
  var packageJsonPath: String | Null
  
  var projectRoot: String
  
  /**
    * The static config path either app.json, app.config.json, or a custom user-defined config.
    */
  var staticConfigPath: String | Null
}
object ConfigContext {
  
  inline def apply(config: PartialExpoConfig, projectRoot: String): ConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], packageJsonPath = null, staticConfigPath = null)
    __obj.asInstanceOf[ConfigContext]
  }
  
  extension [Self <: ConfigContext](x: Self) {
    
    inline def setConfig(value: PartialExpoConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setPackageJsonPath(value: String): Self = StObject.set(x, "packageJsonPath", value.asInstanceOf[js.Any])
    
    inline def setPackageJsonPathNull: Self = StObject.set(x, "packageJsonPath", null)
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setStaticConfigPath(value: String): Self = StObject.set(x, "staticConfigPath", value.asInstanceOf[js.Any])
    
    inline def setStaticConfigPathNull: Self = StObject.set(x, "staticConfigPath", null)
  }
}
