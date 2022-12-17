package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var appName: typings.firebaseAuth.distSrcModelAuthMod.AppName
  
  var missingPlugin: js.UndefOr[String] = js.undefined
}
object `36` {
  
  inline def apply(appName: typings.firebaseAuth.distSrcModelAuthMod.AppName): `36` = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`36`]
  }
  
  extension [Self <: `36`](x: Self) {
    
    inline def setAppName(value: typings.firebaseAuth.distSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setMissingPlugin(value: String): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
    
    inline def setMissingPluginUndefined: Self = StObject.set(x, "missingPlugin", js.undefined)
  }
}
