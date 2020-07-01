package typings.globalize.globalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFormatPart extends js.Object {
  var `type`: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPartTypes
  var value: String
}

object DateFormatPart {
  @scala.inline
  def apply(
    `type`: typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod.DateFormatPartTypes,
    value: String
  ): DateFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatPart]
  }
}

