package typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFormatPart extends js.Object {
  var `type`: DateFormatPartTypes
  var value: String
}

object DateFormatPart {
  @scala.inline
  def apply(`type`: DateFormatPartTypes, value: String): DateFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatPart]
  }
}

