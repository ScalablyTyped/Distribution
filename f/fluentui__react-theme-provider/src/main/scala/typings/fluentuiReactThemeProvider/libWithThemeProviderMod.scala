package typings.fluentuiReactThemeProvider

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWithThemeProviderMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/withThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withThemeProvider[TProps](Component: FunctionComponent[TProps]): ForwardRefExoticComponent[PropsWithoutRef[TProps] & RefAttributes[HTMLButtonElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeProvider")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TProps] & RefAttributes[HTMLButtonElement]]]
}
