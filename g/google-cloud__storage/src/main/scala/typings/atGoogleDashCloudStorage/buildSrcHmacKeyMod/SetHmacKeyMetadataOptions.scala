package typings.atGoogleDashCloudStorage.buildSrcHmacKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetHmacKeyMetadataOptions extends js.Object {
  /**
    * This parameter is currently ignored.
    */
  var userProject: js.UndefOr[String] = js.undefined
}

object SetHmacKeyMetadataOptions {
  @scala.inline
  def apply(userProject: String = null): SetHmacKeyMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHmacKeyMetadataOptions]
  }
}

