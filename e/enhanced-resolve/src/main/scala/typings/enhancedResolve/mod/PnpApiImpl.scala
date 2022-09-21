package typings.enhancedResolve.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PnpApiImpl extends StObject {
  
  def resolveToUnqualified(arg0: String, arg1: String, arg2: js.Object): String
}
object PnpApiImpl {
  
  inline def apply(resolveToUnqualified: (String, String, js.Object) => String): PnpApiImpl = {
    val __obj = js.Dynamic.literal(resolveToUnqualified = js.Any.fromFunction3(resolveToUnqualified))
    __obj.asInstanceOf[PnpApiImpl]
  }
  
  extension [Self <: PnpApiImpl](x: Self) {
    
    inline def setResolveToUnqualified(value: (String, String, js.Object) => String): Self = StObject.set(x, "resolveToUnqualified", js.Any.fromFunction3(value))
  }
}
