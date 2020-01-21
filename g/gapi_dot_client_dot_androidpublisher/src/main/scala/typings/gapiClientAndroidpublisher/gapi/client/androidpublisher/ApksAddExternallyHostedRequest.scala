package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApksAddExternallyHostedRequest extends js.Object {
  /** The definition of the externally-hosted APK and where it is located. */
  var externallyHostedApk: js.UndefOr[ExternallyHostedApk] = js.undefined
}

object ApksAddExternallyHostedRequest {
  @scala.inline
  def apply(externallyHostedApk: ExternallyHostedApk = null): ApksAddExternallyHostedRequest = {
    val __obj = js.Dynamic.literal()
    if (externallyHostedApk != null) __obj.updateDynamic("externallyHostedApk")(externallyHostedApk.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApksAddExternallyHostedRequest]
  }
}

