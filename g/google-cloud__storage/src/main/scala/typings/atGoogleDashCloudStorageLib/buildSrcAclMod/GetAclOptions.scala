package typings
package atGoogleDashCloudStorageLib.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAclOptions extends js.Object {
  var entity: java.lang.String
  var generation: js.UndefOr[scala.Double] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object GetAclOptions {
  @scala.inline
  def apply(
    entity: java.lang.String,
    generation: scala.Int | scala.Double = null,
    userProject: java.lang.String = null
  ): GetAclOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entity")(entity)
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetAclOptions]
  }
}

