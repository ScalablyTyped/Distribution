package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameAppNameMissingPlugin extends StObject {
  
  var appName: typings.firebaseAuth.distCordovaSrcModelAuthMod.AppName
  
  var missingPlugin: js.UndefOr[String] = js.undefined
}
object AppNameAppNameMissingPlugin {
  
  inline def apply(appName: typings.firebaseAuth.distCordovaSrcModelAuthMod.AppName): AppNameAppNameMissingPlugin = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameAppNameMissingPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppNameAppNameMissingPlugin] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: typings.firebaseAuth.distCordovaSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setMissingPlugin(value: String): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
    
    inline def setMissingPluginUndefined: Self = StObject.set(x, "missingPlugin", js.undefined)
  }
}
