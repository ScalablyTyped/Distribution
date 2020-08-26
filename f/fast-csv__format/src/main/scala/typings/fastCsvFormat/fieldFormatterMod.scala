package typings.fastCsvFormat

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptions
import typings.fastCsvFormat.typesMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/format/build/src/formatter/FieldFormatter", JSImport.Namespace)
@js.native
object fieldFormatterMod extends js.Object {
  @js.native
  class FieldFormatter[I /* <: Row */, O /* <: Row */] protected () extends js.Object {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
    val ESCAPE_REGEXP: js.Any = js.native
    val REPLACE_REGEXP: js.Any = js.native
    var _headers: js.Any = js.native
    val formatterOptions: js.Any = js.native
    var quoteField: js.Any = js.native
    var shouldQuote: js.Any = js.native
    def format(field: String, fieldIndex: Double, isHeader: Boolean): String = js.native
    def headers_=(headers: js.Array[String]): Unit = js.native
  }
  
}

