package typings.atGoogleDashCloudStorage.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object BucketOptions {
  @scala.inline
  def apply(userProject: String = null): BucketOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketOptions]
  }
}

