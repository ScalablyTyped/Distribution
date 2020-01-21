package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonAltFields
import typings.gapiClientSqladmin.AnonAltFieldsInstanceKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsResource extends js.Object {
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use
    * the certificate to authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: AnonAltFields): Request_[SslCert]
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: AnonAltFieldsInstanceKey): Request_[Operation]
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: AnonAltFieldsInstanceKey): Request_[SslCert]
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: AnonAltFields): Request_[SslCertsInsertResponse]
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: AnonAltFields): Request_[SslCertsListResponse]
}

object SslCertsResource {
  @scala.inline
  def apply(
    createEphemeral: AnonAltFields => Request_[SslCert],
    delete: AnonAltFieldsInstanceKey => Request_[Operation],
    get: AnonAltFieldsInstanceKey => Request_[SslCert],
    insert: AnonAltFields => Request_[SslCertsInsertResponse],
    list: AnonAltFields => Request_[SslCertsListResponse]
  ): SslCertsResource = {
    val __obj = js.Dynamic.literal(createEphemeral = js.Any.fromFunction1(createEphemeral), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SslCertsResource]
  }
}

