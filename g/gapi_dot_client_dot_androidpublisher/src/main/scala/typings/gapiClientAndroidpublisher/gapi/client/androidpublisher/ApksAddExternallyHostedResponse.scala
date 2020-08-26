package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApksAddExternallyHostedResponse extends js.Object {
  /** The definition of the externally-hosted APK and where it is located. */
  var externallyHostedApk: js.UndefOr[ExternallyHostedApk] = js.native
}

object ApksAddExternallyHostedResponse {
  @scala.inline
  def apply(): ApksAddExternallyHostedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApksAddExternallyHostedResponse]
  }
  @scala.inline
  implicit class ApksAddExternallyHostedResponseOps[Self <: ApksAddExternallyHostedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExternallyHostedApk(value: ExternallyHostedApk): Self = this.set("externallyHostedApk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternallyHostedApk: Self = this.set("externallyHostedApk", js.undefined)
  }
  
}

