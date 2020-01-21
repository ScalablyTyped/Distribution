package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeBucketPublicOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var includeFiles: js.UndefOr[Boolean] = js.undefined
}

object MakeBucketPublicOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, includeFiles: js.UndefOr[Boolean] = js.undefined): MakeBucketPublicOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFiles)) __obj.updateDynamic("includeFiles")(includeFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeBucketPublicOptions]
  }
}

