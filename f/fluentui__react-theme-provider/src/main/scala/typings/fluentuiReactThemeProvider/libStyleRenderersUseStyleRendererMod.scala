package typings.fluentuiReactThemeProvider

import typings.fluentuiReactThemeProvider.libStyleRenderersTypesMod.StyleRenderer
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStyleRenderersUseStyleRendererMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/styleRenderers/useStyleRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/react-theme-provider/lib/styleRenderers/useStyleRenderer", "StyleRendererContext")
  @js.native
  val StyleRendererContext: Context[StyleRenderer] = js.native
  
  inline def useStyleRenderer(): StyleRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleRenderer")().asInstanceOf[StyleRenderer]
}
