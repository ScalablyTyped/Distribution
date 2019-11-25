package typings.atGoogleDashCloudStorage.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombineOptions extends js.Object {
  var kmsKeyName: js.UndefOr[String] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object CombineOptions {
  @scala.inline
  def apply(kmsKeyName: String = null, userProject: String = null): CombineOptions = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombineOptions]
  }
}

