package typings
package atGoogleDashCloudStorageLib.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAclOptions extends js.Object {
  var entity: java.lang.String
  var generation: js.UndefOr[scala.Double] = js.undefined
  var role: java.lang.String
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object AddAclOptions {
  @scala.inline
  def apply(
    entity: java.lang.String,
    role: java.lang.String,
    generation: scala.Int | scala.Double = null,
    userProject: java.lang.String = null
  ): AddAclOptions = {
    val __obj = js.Dynamic.literal(entity = entity, role = role)
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[AddAclOptions]
  }
}

