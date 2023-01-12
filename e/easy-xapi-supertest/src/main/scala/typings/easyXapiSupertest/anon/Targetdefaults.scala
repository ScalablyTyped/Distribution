package typings.easyXapiSupertest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targetdefaults extends StObject {
  
  var target_defaults: Cflags
  
  var variables: Clang
}
object Targetdefaults {
  
  inline def apply(target_defaults: Cflags, variables: Clang): Targetdefaults = {
    val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targetdefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Targetdefaults] (val x: Self) extends AnyVal {
    
    inline def setTarget_defaults(value: Cflags): Self = StObject.set(x, "target_defaults", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Clang): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
