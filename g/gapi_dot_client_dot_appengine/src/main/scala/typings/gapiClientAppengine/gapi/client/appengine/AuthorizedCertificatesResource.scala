package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Accesstoken
import typings.gapiClientAppengine.anon.Alt
import typings.gapiClientAppengine.anon.AppsId
import typings.gapiClientAppengine.anon.AuthorizedCertificatesId
import typings.gapiClientAppengine.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedCertificatesResource extends js.Object {
  /** Uploads the specified SSL certificate. */
  def create(request: Accesstoken): Request[AuthorizedCertificate] = js.native
  /** Deletes the specified SSL certificate. */
  def delete(request: Alt): Request[js.Object] = js.native
  /** Gets the specified SSL certificate. */
  def get(request: AppsId): Request[AuthorizedCertificate] = js.native
  /** Lists all SSL certificates the user is authorized to administer. */
  def list(request: Bearertoken): Request[ListAuthorizedCertificatesResponse] = js.native
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new
    * certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
    */
  def patch(request: AuthorizedCertificatesId): Request[AuthorizedCertificate] = js.native
}

object AuthorizedCertificatesResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[AuthorizedCertificate],
    delete: Alt => Request[js.Object],
    get: AppsId => Request[AuthorizedCertificate],
    list: Bearertoken => Request[ListAuthorizedCertificatesResponse],
    patch: AuthorizedCertificatesId => Request[AuthorizedCertificate]
  ): AuthorizedCertificatesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[AuthorizedCertificatesResource]
  }
  @scala.inline
  implicit class AuthorizedCertificatesResourceOps[Self <: AuthorizedCertificatesResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[AuthorizedCertificate]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Alt => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: AppsId => Request[AuthorizedCertificate]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListAuthorizedCertificatesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: AuthorizedCertificatesId => Request[AuthorizedCertificate]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

