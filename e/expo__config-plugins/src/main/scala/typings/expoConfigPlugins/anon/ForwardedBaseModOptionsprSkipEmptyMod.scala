package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/config-plugins.@expo/config-plugins/build/plugins/createBaseMod.ForwardedBaseModOptions & {  providers :std.Partial<@expo/config-plugins.@expo/config-plugins/build/plugins/withIosBaseMods.IosDefaultProviders> | undefined} */
trait ForwardedBaseModOptionsprSkipEmptyMod extends StObject {
  
  var providers: js.UndefOr[PartialIosDefaultProviderAppDelegate] = js.undefined
  
  var saveToInternal: js.UndefOr[Boolean] = js.undefined
  
  var skipEmptyMod: js.UndefOr[Boolean] = js.undefined
}
object ForwardedBaseModOptionsprSkipEmptyMod {
  
  inline def apply(): ForwardedBaseModOptionsprSkipEmptyMod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedBaseModOptionsprSkipEmptyMod]
  }
  
  extension [Self <: ForwardedBaseModOptionsprSkipEmptyMod](x: Self) {
    
    inline def setProviders(value: PartialIosDefaultProviderAppDelegate): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setSaveToInternal(value: Boolean): Self = StObject.set(x, "saveToInternal", value.asInstanceOf[js.Any])
    
    inline def setSaveToInternalUndefined: Self = StObject.set(x, "saveToInternal", js.undefined)
    
    inline def setSkipEmptyMod(value: Boolean): Self = StObject.set(x, "skipEmptyMod", value.asInstanceOf[js.Any])
    
    inline def setSkipEmptyModUndefined: Self = StObject.set(x, "skipEmptyMod", js.undefined)
  }
}
