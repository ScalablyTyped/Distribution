package typings.expoConfig.configTypesMod

import typings.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectConfig extends StObject {
  
  /**
    * Returns the type of the value exported from the dynamic config.
    * This can be used to determine if the dynamic config is potentially extending a static config when (v === 'function').
    * Returns null if no dynamic config file exists.
    */
  var dynamicConfigObjectType: String | Null
  
  /**
    * Path to an app.config.js or app.config.ts.
    * Returns null if no dynamic config file exists.
    */
  var dynamicConfigPath: String | Null
  
  /**
    * Fully evaluated Expo config with default values injected.
    */
  var exp: ExpoConfig
  
  /**
    * Dynamic config for processing native files during the generation process.
    */
  var mods: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModConfig */ Any) | Null
  ] = js.undefined
  
  /**
    * Project package.json object with default values injected.
    */
  var pkg: PackageJSONConfig
  
  /**
    * Unaltered static config (app.config.json, app.json, or custom json config).
    * For legacy, an empty object will be returned even if no static config exists.
    */
  var rootConfig: AppJSONConfig
  
  /**
    * Path to the static json config file if it exists.
    * If a project has an app.config.js and an app.json then app.json will be returned.
    * If a project has an app.config.json and an app.json then app.config.json will be returned.
    * Returns null if no static config file exists.
    */
  var staticConfigPath: String | Null
}
object ProjectConfig {
  
  inline def apply(exp: ExpoConfig, pkg: PackageJSONConfig, rootConfig: AppJSONConfig): ProjectConfig = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], rootConfig = rootConfig.asInstanceOf[js.Any], dynamicConfigObjectType = null, dynamicConfigPath = null, staticConfigPath = null)
    __obj.asInstanceOf[ProjectConfig]
  }
  
  extension [Self <: ProjectConfig](x: Self) {
    
    inline def setDynamicConfigObjectType(value: String): Self = StObject.set(x, "dynamicConfigObjectType", value.asInstanceOf[js.Any])
    
    inline def setDynamicConfigObjectTypeNull: Self = StObject.set(x, "dynamicConfigObjectType", null)
    
    inline def setDynamicConfigPath(value: String): Self = StObject.set(x, "dynamicConfigPath", value.asInstanceOf[js.Any])
    
    inline def setDynamicConfigPathNull: Self = StObject.set(x, "dynamicConfigPath", null)
    
    inline def setExp(value: ExpoConfig): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setMods(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ModConfig */ Any
    ): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
    
    inline def setModsNull: Self = StObject.set(x, "mods", null)
    
    inline def setModsUndefined: Self = StObject.set(x, "mods", js.undefined)
    
    inline def setPkg(value: PackageJSONConfig): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    inline def setRootConfig(value: AppJSONConfig): Self = StObject.set(x, "rootConfig", value.asInstanceOf[js.Any])
    
    inline def setStaticConfigPath(value: String): Self = StObject.set(x, "staticConfigPath", value.asInstanceOf[js.Any])
    
    inline def setStaticConfigPathNull: Self = StObject.set(x, "staticConfigPath", null)
  }
}
