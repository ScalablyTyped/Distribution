package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileOptions
  extends atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.GetConfig {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object GetFileOptions {
  @scala.inline
  def apply(autoCreate: js.UndefOr[scala.Boolean] = js.undefined, userProject: java.lang.String = null): GetFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetFileOptions]
  }
}

