package typings.fastDashCsv.buildSrcFormatterFormatterFieldFormatterMod

import typings.fastDashCsv.buildSrcFormatterFormatterOptionsMod.FormatterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/formatter/FieldFormatter", JSImport.Default)
@js.native
class default protected () extends FieldFormatter {
  def this(formatterOptions: FormatterOptions) = this()
  /* CompleteClass */
  override val ESCAPE_REGEXP: js.Any = js.native
  /* CompleteClass */
  override val REPLACE_REGEXP: js.Any = js.native
  /* CompleteClass */
  override var _headers: js.Any = js.native
  /* CompleteClass */
  override val formatterOptions: js.Any = js.native
  /* CompleteClass */
  override var quoteField: js.Any = js.native
  /* CompleteClass */
  override var shouldQuote: js.Any = js.native
  /* CompleteClass */
  override def format(field: String, fieldIndex: Double, isHeader: Boolean): String = js.native
  /* CompleteClass */
  override def headers(headers: js.Array[String]): js.Any = js.native
}

