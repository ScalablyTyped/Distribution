package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeAllFilesPublicPrivateOptions extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var public: js.UndefOr[scala.Boolean] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object MakeAllFilesPublicPrivateOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    userProject: java.lang.String = null
  ): MakeAllFilesPublicPrivateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[MakeAllFilesPublicPrivateOptions]
  }
}

