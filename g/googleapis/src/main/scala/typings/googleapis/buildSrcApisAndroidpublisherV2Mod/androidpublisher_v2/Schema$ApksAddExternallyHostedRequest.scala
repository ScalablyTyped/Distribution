package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ApksAddExternallyHostedRequest extends js.Object {
  /**
    * The definition of the externally-hosted APK and where it is located.
    */
  var externallyHostedApk: js.UndefOr[Schema$ExternallyHostedApk] = js.native
}

object Schema$ApksAddExternallyHostedRequest {
  @scala.inline
  def apply(externallyHostedApk: Schema$ExternallyHostedApk = null): Schema$ApksAddExternallyHostedRequest = {
    val __obj = js.Dynamic.literal()
    if (externallyHostedApk != null) __obj.updateDynamic("externallyHostedApk")(externallyHostedApk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApksAddExternallyHostedRequest]
  }
}

