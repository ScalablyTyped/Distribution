package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class AppidMutableBuilder[Self <: Appid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    @scala.inline
    def setApp_installer_id(value: String): Self = StObject.set(x, "app_installer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_installer_idUndefined: Self = StObject.set(x, "app_installer_id", js.undefined)
    
    @scala.inline
    def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_version(value: String): Self = StObject.set(x, "app_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_versionUndefined: Self = StObject.set(x, "app_version", js.undefined)
    
    @scala.inline
    def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
  }
}
