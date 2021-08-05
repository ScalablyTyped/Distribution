package typings.fastCsvFormat

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptions
import typings.fastCsvFormat.typesMod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldFormatterMod {
  
  @JSImport("@fast-csv/format/build/src/formatter/FieldFormatter", "FieldFormatter")
  @js.native
  class FieldFormatter[I /* <: Row */, O /* <: Row */] protected () extends StObject {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
    
    /* private */ val ESCAPE_REGEXP: js.Any = js.native
    
    /* private */ val REPLACE_REGEXP: js.Any = js.native
    
    /* private */ var _headers: js.Any = js.native
    
    def format(field: String, fieldIndex: Double, isHeader: Boolean): String = js.native
    
    /* private */ val formatterOptions: js.Any = js.native
    
    def headers_=(headers: js.Array[String]): Unit = js.native
    
    /* private */ var quoteField: js.Any = js.native
    
    /* private */ var shouldQuote: js.Any = js.native
  }
}
