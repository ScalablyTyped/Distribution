package typings.fluentuiReactThemeProvider

import typings.fluentuiReactThemeProvider.anon.Render
import typings.fluentuiReactThemeProvider.libThemeProviderDottypesMod.ThemeProviderProps
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseThemeProviderMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/useThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useThemeProvider(props: ThemeProviderProps, ref: Ref[HTMLElement], defaultProps: ThemeProviderProps): Render = (^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProvider")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[Render]
}
