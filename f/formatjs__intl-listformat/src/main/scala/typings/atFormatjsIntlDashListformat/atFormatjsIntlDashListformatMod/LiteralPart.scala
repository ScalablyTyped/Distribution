package typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralPart extends Part {
  var `type`: literal
  var value: String
}

object LiteralPart {
  @scala.inline
  def apply(`type`: literal, value: String): LiteralPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralPart]
  }
}

