package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

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
    if (externallyHostedApk != null) __obj.updateDynamic("externallyHostedApk")(externallyHostedApk)
    __obj.asInstanceOf[ApksAddExternallyHostedRequest]
  }
}

