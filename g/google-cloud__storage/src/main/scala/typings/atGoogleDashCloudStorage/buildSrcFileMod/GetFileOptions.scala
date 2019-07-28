package typings.atGoogleDashCloudStorage.buildSrcFileMod

import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.GetConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileOptions extends GetConfig {
  var userProject: js.UndefOr[String] = js.undefined
}

object GetFileOptions {
  @scala.inline
  def apply(autoCreate: js.UndefOr[Boolean] = js.undefined, userProject: String = null): GetFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetFileOptions]
  }
}

