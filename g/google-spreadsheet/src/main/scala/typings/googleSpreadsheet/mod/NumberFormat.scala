package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  /**
    * see https://developers.google.com/sheets/api/guides/formats
    */
  var pattern: String
  var `type`: NumberFormatType
}

object NumberFormat {
  @scala.inline
  def apply(pattern: String, `type`: NumberFormatType): NumberFormat = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
}

