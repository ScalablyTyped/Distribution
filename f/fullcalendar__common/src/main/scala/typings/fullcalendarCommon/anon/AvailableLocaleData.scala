package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.mod.CalendarOptions
import typings.fullcalendarCommon.mod.CalendarOptionsRefined
import typings.fullcalendarCommon.mod.PluginHooks
import typings.fullcalendarCommon.mod.RawLocaleInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableLocaleData extends StObject {
  
  var availableLocaleData: RawLocaleInfo
  
  var localeDefaults: CalendarOptionsRefined
  
  var pluginHooks: PluginHooks
  
  var rawOptions: CalendarOptions
  
  var refinedOptions: CalendarOptionsRefined
}
object AvailableLocaleData {
  
  inline def apply(
    availableLocaleData: RawLocaleInfo,
    localeDefaults: CalendarOptionsRefined,
    pluginHooks: PluginHooks,
    rawOptions: CalendarOptions,
    refinedOptions: CalendarOptionsRefined
  ): AvailableLocaleData = {
    val __obj = js.Dynamic.literal(availableLocaleData = availableLocaleData.asInstanceOf[js.Any], localeDefaults = localeDefaults.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any], rawOptions = rawOptions.asInstanceOf[js.Any], refinedOptions = refinedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableLocaleData]
  }
  
  extension [Self <: AvailableLocaleData](x: Self) {
    
    inline def setAvailableLocaleData(value: RawLocaleInfo): Self = StObject.set(x, "availableLocaleData", value.asInstanceOf[js.Any])
    
    inline def setLocaleDefaults(value: CalendarOptionsRefined): Self = StObject.set(x, "localeDefaults", value.asInstanceOf[js.Any])
    
    inline def setPluginHooks(value: PluginHooks): Self = StObject.set(x, "pluginHooks", value.asInstanceOf[js.Any])
    
    inline def setRawOptions(value: CalendarOptions): Self = StObject.set(x, "rawOptions", value.asInstanceOf[js.Any])
    
    inline def setRefinedOptions(value: CalendarOptionsRefined): Self = StObject.set(x, "refinedOptions", value.asInstanceOf[js.Any])
  }
}
