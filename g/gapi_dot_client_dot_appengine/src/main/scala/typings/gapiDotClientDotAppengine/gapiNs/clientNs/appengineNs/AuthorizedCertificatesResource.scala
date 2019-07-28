package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAppengine.Anon_Accesstoken
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAlt
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsId
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdAuthorizedCertificatesId
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedCertificatesResource extends js.Object {
  /** Uploads the specified SSL certificate. */
  def create(request: Anon_Accesstoken): Request[AuthorizedCertificate]
  /** Deletes the specified SSL certificate. */
  def delete(request: Anon_AccesstokenAlt): Request[js.Object]
  /** Gets the specified SSL certificate. */
  def get(request: Anon_AccesstokenAltAppsId): Request[AuthorizedCertificate]
  /** Lists all SSL certificates the user is authorized to administer. */
  def list(request: Anon_AccesstokenAltAppsIdBearertoken): Request[ListAuthorizedCertificatesResponse]
  /**
    * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new
    * certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
    */
  def patch(request: Anon_AccesstokenAltAppsIdAuthorizedCertificatesId): Request[AuthorizedCertificate]
}

object AuthorizedCertificatesResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[AuthorizedCertificate],
    delete: Anon_AccesstokenAlt => Request[js.Object],
    get: Anon_AccesstokenAltAppsId => Request[AuthorizedCertificate],
    list: Anon_AccesstokenAltAppsIdBearertoken => Request[ListAuthorizedCertificatesResponse],
    patch: Anon_AccesstokenAltAppsIdAuthorizedCertificatesId => Request[AuthorizedCertificate]
  ): AuthorizedCertificatesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[AuthorizedCertificatesResource]
  }
}

