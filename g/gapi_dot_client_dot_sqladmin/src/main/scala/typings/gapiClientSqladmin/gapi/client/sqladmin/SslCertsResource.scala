package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonFields
import typings.gapiClientSqladmin.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsResource extends js.Object {
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use
    * the certificate to authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: AnonFields): Request_[SslCert]
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: AnonPrettyPrint): Request_[Operation]
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: AnonPrettyPrint): Request_[SslCert]
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: AnonFields): Request_[SslCertsInsertResponse]
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: AnonFields): Request_[SslCertsListResponse]
}

object SslCertsResource {
  @scala.inline
  def apply(
    createEphemeral: AnonFields => Request_[SslCert],
    delete: AnonPrettyPrint => Request_[Operation],
    get: AnonPrettyPrint => Request_[SslCert],
    insert: AnonFields => Request_[SslCertsInsertResponse],
    list: AnonFields => Request_[SslCertsListResponse]
  ): SslCertsResource = {
    val __obj = js.Dynamic.literal(createEphemeral = js.Any.fromFunction1(createEphemeral), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SslCertsResource]
  }
}

