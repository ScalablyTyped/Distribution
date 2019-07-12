package typings
package ghostDashStorageDashBaseLib.ghostDashStorageDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var name: java.lang.String
  var path: java.lang.String
  var `type`: java.lang.String
}

object Image {
  @scala.inline
  def apply(name: java.lang.String, path: java.lang.String, `type`: java.lang.String): Image = {
    val __obj = js.Dynamic.literal(name = name, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Image]
  }
}

