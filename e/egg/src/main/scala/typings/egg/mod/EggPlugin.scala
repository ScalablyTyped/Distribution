package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EggPlugin
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[EggPluginItem]] {
  
  var development: js.UndefOr[EggPluginItem] = js.undefined
  
  var i18n: js.UndefOr[EggPluginItem] = js.undefined
  
  var jsonp: js.UndefOr[EggPluginItem] = js.undefined
  
  var logrotator: js.UndefOr[EggPluginItem] = js.undefined
  
  var multipart: js.UndefOr[EggPluginItem] = js.undefined
  
  var onerror: js.UndefOr[EggPluginItem] = js.undefined
  
  var schedule: js.UndefOr[EggPluginItem] = js.undefined
  
  var security: js.UndefOr[EggPluginItem] = js.undefined
  
  var session: js.UndefOr[EggPluginItem] = js.undefined
  
  var static: js.UndefOr[EggPluginItem] = js.undefined
  
  var view: js.UndefOr[EggPluginItem] = js.undefined
  
  var watcher: js.UndefOr[EggPluginItem] = js.undefined
}
object EggPlugin {
  
  inline def apply(): EggPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EggPlugin]
  }
  
  extension [Self <: EggPlugin](x: Self) {
    
    inline def setDevelopment(value: EggPluginItem): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
    
    inline def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
    
    inline def setI18n(value: EggPluginItem): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setJsonp(value: EggPluginItem): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setLogrotator(value: EggPluginItem): Self = StObject.set(x, "logrotator", value.asInstanceOf[js.Any])
    
    inline def setLogrotatorUndefined: Self = StObject.set(x, "logrotator", js.undefined)
    
    inline def setMultipart(value: EggPluginItem): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    inline def setOnerror(value: EggPluginItem): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setSchedule(value: EggPluginItem): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setSecurity(value: EggPluginItem): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSession(value: EggPluginItem): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setStatic(value: EggPluginItem): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setView(value: EggPluginItem): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWatcher(value: EggPluginItem): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
    
    inline def setWatcherUndefined: Self = StObject.set(x, "watcher", js.undefined)
  }
}
