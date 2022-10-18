package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var appName: typings.firebaseAuth.distNodeEsmSrcModelAuthMod.AppName
  
  var missingPlugin: js.UndefOr[String] = js.undefined
}
object `15` {
  
  inline def apply(appName: typings.firebaseAuth.distNodeEsmSrcModelAuthMod.AppName): `15` = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setAppName(value: typings.firebaseAuth.distNodeEsmSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setMissingPlugin(value: String): Self = StObject.set(x, "missingPlugin", value.asInstanceOf[js.Any])
    
    inline def setMissingPluginUndefined: Self = StObject.set(x, "missingPlugin", js.undefined)
  }
}
