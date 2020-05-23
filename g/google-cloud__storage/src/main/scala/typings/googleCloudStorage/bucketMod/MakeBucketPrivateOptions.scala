package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeBucketPrivateOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var includeFiles: js.UndefOr[Boolean] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object MakeBucketPrivateOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[Boolean] = js.undefined,
    includeFiles: js.UndefOr[Boolean] = js.undefined,
    userProject: String = null
  ): MakeBucketPrivateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFiles)) __obj.updateDynamic("includeFiles")(includeFiles.get.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeBucketPrivateOptions]
  }
}

