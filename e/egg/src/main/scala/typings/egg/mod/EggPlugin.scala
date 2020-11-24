package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class EggPluginOps[Self <: EggPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDevelopment(value: EggPluginItem): Self = this.set("development", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevelopment: Self = this.set("development", js.undefined)
    
    @scala.inline
    def setI18n(value: EggPluginItem): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setJsonp(value: EggPluginItem): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setLogrotator(value: EggPluginItem): Self = this.set("logrotator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogrotator: Self = this.set("logrotator", js.undefined)
    
    @scala.inline
    def setMultipart(value: EggPluginItem): Self = this.set("multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    
    @scala.inline
    def setOnerror(value: EggPluginItem): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setSchedule(value: EggPluginItem): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setSecurity(value: EggPluginItem): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSession(value: EggPluginItem): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setStatic(value: EggPluginItem): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    
    @scala.inline
    def setView(value: EggPluginItem): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWatcher(value: EggPluginItem): Self = this.set("watcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatcher: Self = this.set("watcher", js.undefined)
  }
}
