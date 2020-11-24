package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appid
  extends /* key */ StringDictionary[js.Any] {
  
  var app_id: js.UndefOr[String] = js.native
  
  var app_installer_id: js.UndefOr[String] = js.native
  
  var app_name: String = js.native
  
  var app_version: js.UndefOr[String] = js.native
  
  var screen_name: js.UndefOr[String] = js.native
}
object Appid {
  
  @scala.inline
  def apply(app_name: String): Appid = {
    val __obj = js.Dynamic.literal(app_name = app_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
  
  @scala.inline
  implicit class AppidOps[Self <: Appid] (val x: Self) extends AnyVal {
    
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
    def setApp_name(value: String): Self = this.set("app_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_id(value: String): Self = this.set("app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp_id: Self = this.set("app_id", js.undefined)
    
    @scala.inline
    def setApp_installer_id(value: String): Self = this.set("app_installer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp_installer_id: Self = this.set("app_installer_id", js.undefined)
    
    @scala.inline
    def setApp_version(value: String): Self = this.set("app_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp_version: Self = this.set("app_version", js.undefined)
    
    @scala.inline
    def setScreen_name(value: String): Self = this.set("screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreen_name: Self = this.set("screen_name", js.undefined)
  }
}
