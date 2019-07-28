package typings.atGoogleDashCloudStorage.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAclOptions extends js.Object {
  var entity: String
  var generation: js.UndefOr[Double] = js.undefined
  var role: String
  var userProject: js.UndefOr[String] = js.undefined
}

object AddAclOptions {
  @scala.inline
  def apply(entity: String, role: String, generation: Int | Double = null, userProject: String = null): AddAclOptions = {
    val __obj = js.Dynamic.literal(entity = entity, role = role)
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[AddAclOptions]
  }
}

