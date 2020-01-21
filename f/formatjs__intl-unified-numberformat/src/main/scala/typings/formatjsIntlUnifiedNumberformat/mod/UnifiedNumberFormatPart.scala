package typings.formatjsIntlUnifiedNumberformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnifiedNumberFormatPart extends js.Object {
  var `type`: UnifiedNumberFormatPartTypes
  var value: String
}

object UnifiedNumberFormatPart {
  @scala.inline
  def apply(`type`: UnifiedNumberFormatPartTypes, value: String): UnifiedNumberFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnifiedNumberFormatPart]
  }
}

