package typings.devextremeRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shallowEqualMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno-hooks/shallow-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equal(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
