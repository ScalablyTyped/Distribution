package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBucketStorageClassOptions extends js.Object {
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object SetBucketStorageClassOptions {
  @scala.inline
  def apply(userProject: java.lang.String = null): SetBucketStorageClassOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[SetBucketStorageClassOptions]
  }
}

