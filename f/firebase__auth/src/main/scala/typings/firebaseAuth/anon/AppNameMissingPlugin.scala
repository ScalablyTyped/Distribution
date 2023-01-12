package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameMissingPlugin extends StObject {
  
  var appName: typings.firebaseAuth.distCordovaSrcModelAuthMod.AppName
  
  var missingPlugin: js.UndefOr[String] = js.undefined
}
object AppNameMissingPlugin {
  
  inline def apply(appName: typings.firebaseAuth.distCordovaSrcModelAuthMod.AppName): AppNameMissingPlugin = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameMissingPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppNameMissingPlugin] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: typings.firebaseAuth.distCordovaSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setMissingPlugin(value: String): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
    
    inline def setMissingPluginUndefined: Self = StObject.set(x, "missingPlugin", js.undefined)
  }
}
