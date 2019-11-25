package typings.atFormatjsIntlDashListformat.distDashEs6CoreMod

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.element
import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFormatjsIntlDashListformat.distDashEs6CoreMod.LiteralPart
  - typings.atFormatjsIntlDashListformat.distDashEs6CoreMod.ElementPart
*/
trait Part extends js.Object

object Part {
  @scala.inline
  def LiteralPart(`type`: literal, value: String): Part = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  @scala.inline
  def ElementPart(`type`: element, value: String): Part = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
}

