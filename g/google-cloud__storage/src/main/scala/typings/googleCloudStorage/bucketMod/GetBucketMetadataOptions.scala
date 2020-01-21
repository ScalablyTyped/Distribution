package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketMetadataOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object GetBucketMetadataOptions {
  @scala.inline
  def apply(userProject: String = null): GetBucketMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketMetadataOptions]
  }
}

