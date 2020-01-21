package typings.formatjsIntlListformat.mod

import typings.formatjsIntlListformat.formatjsIntlListformatStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementPart extends js.Object {
  var `type`: element
  var value: String
}

object ElementPart {
  @scala.inline
  def apply(`type`: element, value: String): ElementPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementPart]
  }
}

