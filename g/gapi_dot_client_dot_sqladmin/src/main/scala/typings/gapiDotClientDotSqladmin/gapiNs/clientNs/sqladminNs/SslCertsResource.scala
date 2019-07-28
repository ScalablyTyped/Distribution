package typings.gapiDotClientDotSqladmin.gapiNs.clientNs.sqladminNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotSqladmin.Anon_AltFields
import typings.gapiDotClientDotSqladmin.Anon_AltFieldsInstanceKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsResource extends js.Object {
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use
    * the certificate to authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: Anon_AltFields): Request[SslCert]
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: Anon_AltFieldsInstanceKey): Request[Operation]
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: Anon_AltFieldsInstanceKey): Request[SslCert]
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: Anon_AltFields): Request[SslCertsInsertResponse]
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: Anon_AltFields): Request[SslCertsListResponse]
}

object SslCertsResource {
  @scala.inline
  def apply(
    createEphemeral: Anon_AltFields => Request[SslCert],
    delete: Anon_AltFieldsInstanceKey => Request[Operation],
    get: Anon_AltFieldsInstanceKey => Request[SslCert],
    insert: Anon_AltFields => Request[SslCertsInsertResponse],
    list: Anon_AltFields => Request[SslCertsListResponse]
  ): SslCertsResource = {
    val __obj = js.Dynamic.literal(createEphemeral = js.Any.fromFunction1(createEphemeral), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SslCertsResource]
  }
}

