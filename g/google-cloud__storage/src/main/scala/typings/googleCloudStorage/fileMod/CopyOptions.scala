package typings.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var destinationKmsKeyName: js.UndefOr[String] = js.undefined
  var keepAcl: js.UndefOr[String] = js.undefined
  var predefinedAcl: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    destinationKmsKeyName: String = null,
    keepAcl: String = null,
    predefinedAcl: String = null,
    token: String = null,
    userProject: String = null
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (destinationKmsKeyName != null) __obj.updateDynamic("destinationKmsKeyName")(destinationKmsKeyName.asInstanceOf[js.Any])
    if (keepAcl != null) __obj.updateDynamic("keepAcl")(keepAcl.asInstanceOf[js.Any])
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyOptions]
  }
}

