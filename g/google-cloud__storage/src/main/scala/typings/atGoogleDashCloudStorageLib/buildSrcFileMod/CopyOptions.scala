package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var destinationKmsKeyName: js.UndefOr[java.lang.String] = js.undefined
  var keepAcl: js.UndefOr[java.lang.String] = js.undefined
  var predefinedAcl: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    destinationKmsKeyName: java.lang.String = null,
    keepAcl: java.lang.String = null,
    predefinedAcl: java.lang.String = null,
    token: java.lang.String = null,
    userProject: java.lang.String = null
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (destinationKmsKeyName != null) __obj.updateDynamic("destinationKmsKeyName")(destinationKmsKeyName)
    if (keepAcl != null) __obj.updateDynamic("keepAcl")(keepAcl)
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl)
    if (token != null) __obj.updateDynamic("token")(token)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[CopyOptions]
  }
}

