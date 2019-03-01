package typings
package easyDashXDashHeadersLib.expressMod.eNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var quality: scala.Double
  var subtype: java.lang.String
  var `type`: java.lang.String
  var value: java.lang.String
}

object MediaType {
  @scala.inline
  def apply(
    quality: scala.Double,
    subtype: java.lang.String,
    `type`: java.lang.String,
    value: java.lang.String
  ): MediaType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("quality")(quality)
    __obj.updateDynamic("subtype")(subtype)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MediaType]
  }
}

