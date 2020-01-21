package typings.fastCsv.formatterOptionsMod

import typings.fastCsv.typesMod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/FormatterOptions", "FormatterOptions")
@js.native
class FormatterOptions () extends js.Object {
  def this(opts: FormatterOptionsArgs) = this()
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
  val transform: RowTransformFunction | Null = js.native
  val writeBOM: Boolean = js.native
}

