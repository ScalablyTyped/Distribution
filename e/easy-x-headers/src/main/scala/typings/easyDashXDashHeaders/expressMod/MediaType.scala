package typings.easyDashXDashHeaders.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var quality: Double
  var subtype: String
  var `type`: String
  var value: String
}

object MediaType {
  @scala.inline
  def apply(quality: Double, subtype: String, `type`: String, value: String): MediaType = {
    val __obj = js.Dynamic.literal(quality = quality, subtype = subtype, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaType]
  }
}

