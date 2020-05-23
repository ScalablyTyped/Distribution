package typings.googleCloudStorage.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAclOptions extends js.Object {
  var entity: String
  var generation: js.UndefOr[Double] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object RemoveAclOptions {
  @scala.inline
  def apply(entity: String, generation: js.UndefOr[Double] = js.undefined, userProject: String = null): RemoveAclOptions = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    if (!js.isUndefined(generation)) __obj.updateDynamic("generation")(generation.get.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAclOptions]
  }
}

