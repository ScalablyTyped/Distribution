package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApksAddExternallyHostedResponse extends js.Object {
  /** The definition of the externally-hosted APK and where it is located. */
  var externallyHostedApk: js.UndefOr[ExternallyHostedApk] = js.undefined
}

object ApksAddExternallyHostedResponse {
  @scala.inline
  def apply(externallyHostedApk: ExternallyHostedApk = null): ApksAddExternallyHostedResponse = {
    val __obj = js.Dynamic.literal()
    if (externallyHostedApk != null) __obj.updateDynamic("externallyHostedApk")(externallyHostedApk)
    __obj.asInstanceOf[ApksAddExternallyHostedResponse]
  }
}

