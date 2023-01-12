package typings.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigOptions extends StObject {
  
  /**
    * Should the config `mods` be preserved in the config? Used for compiling mods in the eject command.
    *
    * @default false
    */
  var isModdedConfig: js.UndefOr[Boolean] = js.undefined
  
  var isPublicConfig: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dangerously skip resolving plugins.
    */
  var skipPlugins: js.UndefOr[Boolean] = js.undefined
  
  var skipSDKVersionRequirement: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object GetConfigOptions {
  
  inline def apply(): GetConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfigOptions] (val x: Self) extends AnyVal {
    
    inline def setIsModdedConfig(value: Boolean): Self = StObject.set(x, "isModdedConfig", value.asInstanceOf[js.Any])
    
    inline def setIsModdedConfigUndefined: Self = StObject.set(x, "isModdedConfig", js.undefined)
    
    inline def setIsPublicConfig(value: Boolean): Self = StObject.set(x, "isPublicConfig", value.asInstanceOf[js.Any])
    
    inline def setIsPublicConfigUndefined: Self = StObject.set(x, "isPublicConfig", js.undefined)
    
    inline def setSkipPlugins(value: Boolean): Self = StObject.set(x, "skipPlugins", value.asInstanceOf[js.Any])
    
    inline def setSkipPluginsUndefined: Self = StObject.set(x, "skipPlugins", js.undefined)
    
    inline def setSkipSDKVersionRequirement(value: Boolean): Self = StObject.set(x, "skipSDKVersionRequirement", value.asInstanceOf[js.Any])
    
    inline def setSkipSDKVersionRequirementUndefined: Self = StObject.set(x, "skipSDKVersionRequirement", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
