package typings.easyDashXapiDashSupertest.expressMod

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
    val __obj = js.Dynamic.literal(quality = quality.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
}

