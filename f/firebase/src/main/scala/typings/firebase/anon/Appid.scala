package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appid
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var app_id: js.UndefOr[String] = js.undefined
  
  var app_installer_id: js.UndefOr[String] = js.undefined
  
  var app_name: String
  
  var app_version: js.UndefOr[String] = js.undefined
  
  var screen_name: js.UndefOr[String] = js.undefined
}
object Appid {
  
  inline def apply(app_name: String): Appid = {
    val __obj = js.Dynamic.literal(app_name = app_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
  
  extension [Self <: Appid](x: Self) {
    
    inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setApp_installer_id(value: String): Self = StObject.set(x, "app_installer_id", value.asInstanceOf[js.Any])
    
    inline def setApp_installer_idUndefined: Self = StObject.set(x, "app_installer_id", js.undefined)
    
    inline def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
    
    inline def setApp_version(value: String): Self = StObject.set(x, "app_version", value.asInstanceOf[js.Any])
    
    inline def setApp_versionUndefined: Self = StObject.set(x, "app_version", js.undefined)
    
    inline def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
    
    inline def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
  }
}
