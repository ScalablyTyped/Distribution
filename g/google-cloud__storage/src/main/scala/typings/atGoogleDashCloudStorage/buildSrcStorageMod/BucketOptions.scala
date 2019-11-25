package typings.atGoogleDashCloudStorage.buildSrcStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketOptions extends js.Object {
  var kmsKeyName: js.UndefOr[String] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object BucketOptions {
  @scala.inline
  def apply(kmsKeyName: String = null, userProject: String = null): BucketOptions = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketOptions]
  }
}

