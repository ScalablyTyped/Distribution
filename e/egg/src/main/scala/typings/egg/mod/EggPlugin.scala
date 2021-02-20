package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EggPlugin
  extends /* key */ StringDictionary[js.UndefOr[EggPluginItem]] {
  
  var development: js.UndefOr[EggPluginItem] = js.native
  
  var i18n: js.UndefOr[EggPluginItem] = js.native
  
  var jsonp: js.UndefOr[EggPluginItem] = js.native
  
  var logrotator: js.UndefOr[EggPluginItem] = js.native
  
  var multipart: js.UndefOr[EggPluginItem] = js.native
  
  var onerror: js.UndefOr[EggPluginItem] = js.native
  
  var schedule: js.UndefOr[EggPluginItem] = js.native
  
  var security: js.UndefOr[EggPluginItem] = js.native
  
  var session: js.UndefOr[EggPluginItem] = js.native
  
  var static: js.UndefOr[EggPluginItem] = js.native
  
  var view: js.UndefOr[EggPluginItem] = js.native
  
  var watcher: js.UndefOr[EggPluginItem] = js.native
}
object EggPlugin {
  
  @scala.inline
  def apply(): EggPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EggPlugin]
  }
  
  @scala.inline
  implicit class EggPluginMutableBuilder[Self <: EggPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevelopment(value: EggPluginItem): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
    
    @scala.inline
    def setI18n(value: EggPluginItem): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setJsonp(value: EggPluginItem): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setLogrotator(value: EggPluginItem): Self = StObject.set(x, "logrotator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogrotatorUndefined: Self = StObject.set(x, "logrotator", js.undefined)
    
    @scala.inline
    def setMultipart(value: EggPluginItem): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    @scala.inline
    def setOnerror(value: EggPluginItem): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setSchedule(value: EggPluginItem): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setSecurity(value: EggPluginItem): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setSession(value: EggPluginItem): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setStatic(value: EggPluginItem): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    @scala.inline
    def setView(value: EggPluginItem): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWatcher(value: EggPluginItem): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatcherUndefined: Self = StObject.set(x, "watcher", js.undefined)
  }
}
