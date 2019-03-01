package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombineOptions extends js.Object {
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object CombineOptions {
  @scala.inline
  def apply(kmsKeyName: java.lang.String = null, userProject: java.lang.String = null): CombineOptions = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[CombineOptions]
  }
}

