package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var appName: js.UndefOr[typings.firebaseAuth.distEsm5SrcModelAuthMod.AppName] = js.undefined
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `12`] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: typings.firebaseAuth.distEsm5SrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
  }
}
