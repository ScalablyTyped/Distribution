package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonAccesstoken
import typings.gapiClientAppengine.AnonAlt
import typings.gapiClientAppengine.AnonAppsId
import typings.gapiClientAppengine.AnonAuthorizedCertificatesId
import typings.gapiClientAppengine.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedCertificatesResource extends js.Object {
  /** Uploads the specified SSL certificate. */
  def create(request: AnonAccesstoken): Request_[AuthorizedCertificate]
  /** Deletes the specified SSL certificate. */
  def delete(request: AnonAlt): Request_[js.Object]
  /** Gets the specified SSL certificate. */
  def get(request: AnonAppsId): Request_[AuthorizedCertificate]
  /** Lists all SSL certificates the user is authorized to administer. */
  def list(request: AnonBearertoken): Request_[ListAuthorizedCertificatesResponse]
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new
    * certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
    */
  def patch(request: AnonAuthorizedCertificatesId): Request_[AuthorizedCertificate]
}

object AuthorizedCertificatesResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[AuthorizedCertificate],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAppsId => Request_[AuthorizedCertificate],
    list: AnonBearertoken => Request_[ListAuthorizedCertificatesResponse],
    patch: AnonAuthorizedCertificatesId => Request_[AuthorizedCertificate]
  ): AuthorizedCertificatesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[AuthorizedCertificatesResource]
  }
}

