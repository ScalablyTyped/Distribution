package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeBucketPublicOptions extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var includeFiles: js.UndefOr[scala.Boolean] = js.undefined
}

object MakeBucketPublicOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    includeFiles: js.UndefOr[scala.Boolean] = js.undefined
  ): MakeBucketPublicOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(includeFiles)) __obj.updateDynamic("includeFiles")(includeFiles)
    __obj.asInstanceOf[MakeBucketPublicOptions]
  }
}

