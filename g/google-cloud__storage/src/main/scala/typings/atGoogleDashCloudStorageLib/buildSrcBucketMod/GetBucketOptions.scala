package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketOptions
  extends atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.GetConfig {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object GetBucketOptions {
  @scala.inline
  def apply(autoCreate: js.UndefOr[scala.Boolean] = js.undefined, userProject: java.lang.String = null): GetBucketOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[GetBucketOptions]
  }
}

