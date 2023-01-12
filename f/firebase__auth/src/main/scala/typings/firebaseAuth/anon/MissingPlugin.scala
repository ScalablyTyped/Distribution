package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingPlugin extends StObject {
  
  var appName: typings.firebaseAuth.distAuthMod.AppName
  
  var missingPlugin: js.UndefOr[String] = js.undefined
}
object MissingPlugin {
  
  inline def apply(appName: typings.firebaseAuth.distAuthMod.AppName): MissingPlugin = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MissingPlugin] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: typings.firebaseAuth.distAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setMissingPlugin(value: String): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
    
    inline def setMissingPluginUndefined: Self = StObject.set(x, "missingPlugin", js.undefined)
  }
}
