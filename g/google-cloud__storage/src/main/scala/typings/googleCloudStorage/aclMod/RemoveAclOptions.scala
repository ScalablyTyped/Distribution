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
  def apply(entity: String, generation: Int | Double = null, userProject: String = null): RemoveAclOptions = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAclOptions]
  }
}

