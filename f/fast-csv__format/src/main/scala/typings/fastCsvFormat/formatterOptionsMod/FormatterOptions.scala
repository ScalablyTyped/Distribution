package typings.fastCsvFormat.formatterOptionsMod

import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvFormat.typesMod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/format/build/src/FormatterOptions", "FormatterOptions")
@js.native
class FormatterOptions[I /* <: Row */, O /* <: Row */] () extends js.Object {
  def this(opts: FormatterOptionsArgs[I, O]) = this()
  
  val BOM: String = js.native
  
  val alwaysWriteHeaders: Boolean = js.native
  
  val delimiter: String = js.native
  
  val escape: String = js.native
  
  val escapedQuote: String = js.native
  
  val headers: Null | js.Array[String] = js.native
  
  val includeEndRowDelimiter: Boolean = js.native
  
  val objectMode: Boolean = js.native
  
  val quote: String = js.native
  
  val quoteColumns: QuoteColumns = js.native
  
  val quoteHeaders: QuoteColumns = js.native
  
  val rowDelimiter: String = js.native
  
  val shouldWriteHeaders: Boolean = js.native
  
  val transform: js.UndefOr[RowTransformFunction[I, O]] = js.native
  
  val writeBOM: Boolean = js.native
}
