package typings.fastDashCsv.buildSrcParserParserColumnColumnFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFormatter extends js.Object {
  def format(col: String): String
}

object ColumnFormatter {
  @scala.inline
  def apply(format: String => String): ColumnFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
  
    __obj.asInstanceOf[ColumnFormatter]
  }
}

