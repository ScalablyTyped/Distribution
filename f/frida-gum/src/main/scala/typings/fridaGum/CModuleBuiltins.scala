package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builtins present when constructing a CModule from C source code.
  *
  * This is typically used by a scaffolding tool such as `frida-create` in order
  * to set up a build environment that matches what CModule uses.
  */
trait CModuleBuiltins extends StObject {
  
  var defines: CModuleDefines
  
  var headers: CModuleHeaders
}
object CModuleBuiltins {
  
  inline def apply(defines: CModuleDefines, headers: CModuleHeaders): CModuleBuiltins = {
    val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CModuleBuiltins]
  }
  
  extension [Self <: CModuleBuiltins](x: Self) {
    
    inline def setDefines(value: CModuleDefines): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: CModuleHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
