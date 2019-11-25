package typings.atGoogleDashCloudStorage.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object DeleteBucketOptions {
  @scala.inline
  def apply(userProject: String = null): DeleteBucketOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketOptions]
  }
}

