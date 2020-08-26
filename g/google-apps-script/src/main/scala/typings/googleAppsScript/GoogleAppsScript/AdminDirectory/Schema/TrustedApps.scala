package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedApps extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var trustedApps: js.UndefOr[js.Array[TrustedAppId]] = js.native
}

object TrustedApps {
  @scala.inline
  def apply(): TrustedApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedApps]
  }
  @scala.inline
  implicit class TrustedAppsOps[Self <: TrustedApps] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTrustedAppsVarargs(value: TrustedAppId*): Self = this.set("trustedApps", js.Array(value :_*))
    @scala.inline
    def setTrustedApps(value: js.Array[TrustedAppId]): Self = this.set("trustedApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustedApps: Self = this.set("trustedApps", js.undefined)
  }
  
}

