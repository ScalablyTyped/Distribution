package typings.fluentuiUtilities

import typings.fluentuiUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderFunctionComposeRenderFunctionMod {
  
  @JSImport("@fluentui/utilities/lib/renderFunction/composeRenderFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeRenderFunction[TProps](outer: IRenderFunction[TProps], inner: IRenderFunction[TProps]): IRenderFunction[TProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeRenderFunction")(outer.asInstanceOf[js.Any], inner.asInstanceOf[js.Any])).asInstanceOf[IRenderFunction[TProps]]
}
