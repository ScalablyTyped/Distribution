package typings.fastCsvFormat

import typings.fastCsvFormat.buildSrcFormatterOptionsMod.FormatterOptions
import typings.fastCsvFormat.buildSrcTypesMod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFormatterFieldFormatterMod {
  
  @JSImport("@fast-csv/format/build/src/formatter/FieldFormatter", "FieldFormatter")
  @js.native
  open class FieldFormatter[I /* <: Row */, O /* <: Row */] protected () extends StObject {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
    
    /* private */ val ESCAPE_REGEXP: Any = js.native
    
    /* private */ val REPLACE_REGEXP: Any = js.native
    
    /* private */ var _headers: Any = js.native
    
    def format(field: String, fieldIndex: Double, isHeader: Boolean): String = js.native
    
    /* private */ val formatterOptions: Any = js.native
    
    def headers_=(headers: js.Array[String]): Unit = js.native
    
    /* private */ var quoteField: Any = js.native
    
    /* private */ var shouldQuote: Any = js.native
  }
}
