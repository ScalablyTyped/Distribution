package typings.ghostDashStorageDashBase.ghostDashStorageDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var name: String
  var path: String
  var `type`: String
}

object Image {
  @scala.inline
  def apply(name: String, path: String, `type`: String): Image = {
    val __obj = js.Dynamic.literal(name = name, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Image]
  }
}

