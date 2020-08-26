package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAppId extends js.Object {
  var androidPackageName: js.UndefOr[String] = js.native
  var certificateHashSHA1: js.UndefOr[String] = js.native
  var certificateHashSHA256: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object TrustedAppId {
  @scala.inline
  def apply(): TrustedAppId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedAppId]
  }
  @scala.inline
  implicit class TrustedAppIdOps[Self <: TrustedAppId] (val x: Self) extends AnyVal {
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
    def setAndroidPackageName(value: String): Self = this.set("androidPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidPackageName: Self = this.set("androidPackageName", js.undefined)
    @scala.inline
    def setCertificateHashSHA1(value: String): Self = this.set("certificateHashSHA1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateHashSHA1: Self = this.set("certificateHashSHA1", js.undefined)
    @scala.inline
    def setCertificateHashSHA256(value: String): Self = this.set("certificateHashSHA256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateHashSHA256: Self = this.set("certificateHashSHA256", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

