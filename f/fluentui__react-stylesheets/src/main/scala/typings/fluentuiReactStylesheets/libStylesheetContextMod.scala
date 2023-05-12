package typings.fluentuiReactStylesheets

import typings.react.mod.Context
import typings.std.Document
import typings.std.Map
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesheetContextMod {
  
  @JSImport("@fluentui/react-stylesheets/lib/StylesheetContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/react-stylesheets/lib/StylesheetContext", "StylesheetContext")
  @js.native
  val StylesheetContext: Context[StylesheetContextType] = js.native
  
  inline def registerStyles(sheets: String, context: StylesheetContextType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStyles")(sheets.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerStyles(sheets: js.Array[String], context: StylesheetContextType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStyles")(sheets.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerStyles(sheets: Unit, context: StylesheetContextType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerStyles")(sheets.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.rtl
    - typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.ltr
    - typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.auto
  */
  trait HTMLDirection extends StObject
  object HTMLDirection {
    
    inline def auto: typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.auto = "auto".asInstanceOf[typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.auto]
    
    inline def ltr: typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.ltr = "ltr".asInstanceOf[typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.ltr]
    
    inline def rtl: typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.rtl = "rtl".asInstanceOf[typings.fluentuiReactStylesheets.fluentuiReactStylesheetsStrings.rtl]
  }
  
  @js.native
  trait StylesheetContextType extends StObject {
    
    def registerStyles(stylesheets: String, context: StylesheetContextType): Unit = js.native
    def registerStyles(stylesheets: js.Array[String], context: StylesheetContextType): Unit = js.native
    def registerStyles(stylesheets: Unit, context: StylesheetContextType): Unit = js.native
    
    def renderStyles(stylesheets: js.Array[String], context: StylesheetContextType): Unit = js.native
    
    var styleCache: WeakMap[Document | typings.fluentuiReactStylesheets.anon.Document, Map[String, Boolean]] = js.native
    
    var target: js.UndefOr[Document] = js.native
  }
}
