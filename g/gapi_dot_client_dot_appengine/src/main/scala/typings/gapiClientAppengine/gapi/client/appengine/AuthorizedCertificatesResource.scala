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

trait AuthorizedCertificatesResource extends js.Object {
  /** Uploads the specified SSL certificate. */
  def create(request: Accesstoken): Request[AuthorizedCertificate]
  /** Deletes the specified SSL certificate. */
  def delete(request: Alt): Request[js.Object]
  /** Gets the specified SSL certificate. */
  def get(request: AppsId): Request[AuthorizedCertificate]
  /** Lists all SSL certificates the user is authorized to administer. */
  def list(request: Bearertoken): Request[ListAuthorizedCertificatesResponse]
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new
    * certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
    */
  def patch(request: AuthorizedCertificatesId): Request[AuthorizedCertificate]
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
}

