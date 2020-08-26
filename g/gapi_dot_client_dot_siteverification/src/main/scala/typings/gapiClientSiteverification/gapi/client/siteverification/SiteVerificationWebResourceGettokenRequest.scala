package typings.gapiClientSiteverification.gapi.client.siteverification

import typings.gapiClientSiteverification.anon.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteVerificationWebResourceGettokenRequest extends js.Object {
  /** The site for which a verification token will be generated. */
  var site: js.UndefOr[Identifier] = js.native
  /** The verification method that will be used to verify this site. For sites, 'FILE' or 'META' methods may be used. For domains, only 'DNS' may be used. */
  var verificationMethod: js.UndefOr[String] = js.native
}

object SiteVerificationWebResourceGettokenRequest {
  @scala.inline
  def apply(): SiteVerificationWebResourceGettokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVerificationWebResourceGettokenRequest]
  }
  @scala.inline
  implicit class SiteVerificationWebResourceGettokenRequestOps[Self <: SiteVerificationWebResourceGettokenRequest] (val x: Self) extends AnyVal {
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
    def setSite(value: Identifier): Self = this.set("site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    @scala.inline
    def setVerificationMethod(value: String): Self = this.set("verificationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationMethod: Self = this.set("verificationMethod", js.undefined)
  }
  
}

