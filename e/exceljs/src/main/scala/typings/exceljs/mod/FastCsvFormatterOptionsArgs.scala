package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastCsvFormatterOptionsArgs extends js.Object {
  var alwaysWriteHeaders: Boolean = js.native
  var delimiter: String = js.native
  var escape: String = js.native
  var headers: Null | Boolean | js.Array[String] = js.native
  var includeEndRowDelimiter: Boolean = js.native
  var objectMode: Boolean = js.native
  var quote: String | Boolean = js.native
  var quoteColumns: QuoteColumns = js.native
  var quoteHeaders: QuoteColumns = js.native
  var rowDelimiter: String = js.native
  @JSName("transform")
  var transform_Original: RowTransformFunction = js.native
  var writeBOM: Boolean = js.native
  def transform(row: Rows): Rows = js.native
  def transform(row: Rows, callback: RowTransformCallback): Unit = js.native
}

