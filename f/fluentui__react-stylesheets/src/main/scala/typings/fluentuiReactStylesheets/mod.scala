package typings.fluentuiReactStylesheets

import typings.fluentuiReactStylesheets.libStylesheetContextMod.StylesheetContextType
import typings.fluentuiReactStylesheets.libStylesheetProviderDottypesMod.StylesheetProviderProps
import typings.react.mod.Context
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/react-stylesheets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/react-stylesheets", "StylesheetContext")
  @js.native
  val StylesheetContext: Context[StylesheetContextType] = js.native
  
  inline def StylesheetProvider(props: PropsWithChildren[StylesheetProviderProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StylesheetProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useStylesheet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStylesheet")().asInstanceOf[Unit]
  inline def useStylesheet(sheets: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStylesheet")(sheets.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useStylesheet(sheets: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStylesheet")(sheets.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
