package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var appName: js.UndefOr[typings.firebaseAuth.distEsm2017SrcModelAuthMod.AppName] = js.undefined
  
  var originalMessage: js.UndefOr[String] = js.undefined
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setAppName(value: typings.firebaseAuth.distEsm2017SrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setOriginalMessage(value: String): Self = StObject.set(x, "originalMessage", value.asInstanceOf[js.Any])
    
    inline def setOriginalMessageUndefined: Self = StObject.set(x, "originalMessage", js.undefined)
  }
}
