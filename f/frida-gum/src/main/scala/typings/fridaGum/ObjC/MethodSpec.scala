package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ObjC.SimpleMethodSpec[I]
  - typings.fridaGum.ObjC.DetailedMethodSpec[I]
*/
trait MethodSpec[I] extends StObject
object MethodSpec {
  
  inline def DetailedMethodSpec[I](implementation: I, types: String): typings.fridaGum.ObjC.DetailedMethodSpec[I] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ObjC.DetailedMethodSpec[I]]
  }
  
  inline def SimpleMethodSpec[I](argTypes: js.Array[String], implementation: I, retType: String): typings.fridaGum.ObjC.SimpleMethodSpec[I] = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ObjC.SimpleMethodSpec[I]]
  }
}
