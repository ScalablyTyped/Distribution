package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Fields
import typings.gapiClientSqladmin.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsResource extends js.Object {
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use
    * the certificate to authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: Fields): Request[SslCert]
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: PrettyPrint): Request[Operation]
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: PrettyPrint): Request[SslCert]
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: Fields): Request[SslCertsInsertResponse]
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: Fields): Request[SslCertsListResponse]
}

object SslCertsResource {
  @scala.inline
  def apply(
    createEphemeral: Fields => Request[SslCert],
    delete: PrettyPrint => Request[Operation],
    get: PrettyPrint => Request[SslCert],
    insert: Fields => Request[SslCertsInsertResponse],
    list: Fields => Request[SslCertsListResponse]
  ): SslCertsResource = {
    val __obj = js.Dynamic.literal(createEphemeral = js.Any.fromFunction1(createEphemeral), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SslCertsResource]
  }
}

