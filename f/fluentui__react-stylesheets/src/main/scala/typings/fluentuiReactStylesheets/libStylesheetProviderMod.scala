package typings.fluentuiReactStylesheets

import typings.fluentuiReactStylesheets.libStylesheetContextMod.StylesheetContextType
import typings.fluentuiReactStylesheets.libStylesheetProviderDottypesMod.StylesheetProviderProps
import typings.react.mod.Consumer
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesheetProviderMod {
  
  @JSImport("@fluentui/react-stylesheets/lib/StylesheetProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/react-stylesheets/lib/StylesheetProvider", "StylesheetConsumer")
  @js.native
  val StylesheetConsumer: Consumer[StylesheetContextType] = js.native
  
  inline def StylesheetProvider(props: PropsWithChildren[StylesheetProviderProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StylesheetProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
