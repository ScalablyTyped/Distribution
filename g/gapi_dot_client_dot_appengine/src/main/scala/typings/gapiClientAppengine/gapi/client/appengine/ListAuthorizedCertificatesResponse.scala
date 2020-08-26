package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuthorizedCertificatesResponse extends js.Object {
  /** The SSL certificates the user is authorized to administer. */
  var certificates: js.UndefOr[js.Array[AuthorizedCertificate]] = js.native
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListAuthorizedCertificatesResponse {
  @scala.inline
  def apply(): ListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuthorizedCertificatesResponse]
  }
  @scala.inline
  implicit class ListAuthorizedCertificatesResponseOps[Self <: ListAuthorizedCertificatesResponse] (val x: Self) extends AnyVal {
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
    def setCertificatesVarargs(value: AuthorizedCertificate*): Self = this.set("certificates", js.Array(value :_*))
    @scala.inline
    def setCertificates(value: js.Array[AuthorizedCertificate]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

