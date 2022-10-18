package typings.fluentuiUtilities

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestInjectWrapperMethodMod {
  
  @JSImport("@fluentui/utilities/lib/test/injectWrapperMethod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectWrapperMethod(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, Any]],
    methodName: String,
    fn: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectWrapperMethod")(wrapper.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
