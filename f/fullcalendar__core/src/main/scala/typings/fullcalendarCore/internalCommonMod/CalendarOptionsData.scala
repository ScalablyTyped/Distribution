package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarOptionsData extends StObject {
  
  var availableRawLocales: Any
  
  var calendarOptions: CalendarOptionsRefined
  
  var dateEnv: DateEnv
  
  var localeDefaults: CalendarOptions
  
  var pluginHooks: PluginHooks
  
  var theme: Theme
  
  var toolbarConfig: Any
  
  var viewSpecs: ViewSpecHash
}
object CalendarOptionsData {
  
  inline def apply(
    availableRawLocales: Any,
    calendarOptions: CalendarOptionsRefined,
    dateEnv: DateEnv,
    localeDefaults: CalendarOptions,
    pluginHooks: PluginHooks,
    theme: Theme,
    toolbarConfig: Any,
    viewSpecs: ViewSpecHash
  ): CalendarOptionsData = {
    val __obj = js.Dynamic.literal(availableRawLocales = availableRawLocales.asInstanceOf[js.Any], calendarOptions = calendarOptions.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], localeDefaults = localeDefaults.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toolbarConfig = toolbarConfig.asInstanceOf[js.Any], viewSpecs = viewSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptionsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarOptionsData] (val x: Self) extends AnyVal {
    
    inline def setAvailableRawLocales(value: Any): Self = StObject.set(x, "availableRawLocales", value.asInstanceOf[js.Any])
    
    inline def setCalendarOptions(value: CalendarOptionsRefined): Self = StObject.set(x, "calendarOptions", value.asInstanceOf[js.Any])
    
    inline def setDateEnv(value: DateEnv): Self = StObject.set(x, "dateEnv", value.asInstanceOf[js.Any])
    
    inline def setLocaleDefaults(value: CalendarOptions): Self = StObject.set(x, "localeDefaults", value.asInstanceOf[js.Any])
    
    inline def setPluginHooks(value: PluginHooks): Self = StObject.set(x, "pluginHooks", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setToolbarConfig(value: Any): Self = StObject.set(x, "toolbarConfig", value.asInstanceOf[js.Any])
    
    inline def setViewSpecs(value: ViewSpecHash): Self = StObject.set(x, "viewSpecs", value.asInstanceOf[js.Any])
  }
}
