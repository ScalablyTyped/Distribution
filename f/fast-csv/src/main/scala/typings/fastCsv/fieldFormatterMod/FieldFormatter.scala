package typings.fastCsv.fieldFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldFormatter extends js.Object {
  val ESCAPE_REGEXP: js.Any
  val REPLACE_REGEXP: js.Any
  var _headers: js.Any
  val formatterOptions: js.Any
  var quoteField: js.Any
  var shouldQuote: js.Any
  def format(field: String, fieldIndex: Double, isHeader: Boolean): String
  def headers(headers: js.Array[String]): js.Any
}

object FieldFormatter {
  @scala.inline
  def apply(
    ESCAPE_REGEXP: js.Any,
    REPLACE_REGEXP: js.Any,
    _headers: js.Any,
    format: (String, Double, Boolean) => String,
    formatterOptions: js.Any,
    headers: js.Array[String] => js.Any,
    quoteField: js.Any,
    shouldQuote: js.Any
  ): FieldFormatter = {
    val __obj = js.Dynamic.literal(ESCAPE_REGEXP = ESCAPE_REGEXP.asInstanceOf[js.Any], REPLACE_REGEXP = REPLACE_REGEXP.asInstanceOf[js.Any], _headers = _headers.asInstanceOf[js.Any], format = js.Any.fromFunction3(format), formatterOptions = formatterOptions.asInstanceOf[js.Any], headers = js.Any.fromFunction1(headers), quoteField = quoteField.asInstanceOf[js.Any], shouldQuote = shouldQuote.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldFormatter]
  }
}

