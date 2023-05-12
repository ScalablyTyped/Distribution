package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var appName: js.UndefOr[typings.firebaseAuth.distNodeEsmSrcModelAuthMod.AppName] = js.undefined
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: typings.firebaseAuth.distNodeEsmSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
  }
}
