package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertsResource extends js.Object {
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use
    * the certificate to authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SslCert]
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: gapiDotClientDotSqladminLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: gapiDotClientDotSqladminLib.Anon_AltFieldsInstanceKey): gapiDotClientLib.gapiNs.clientNs.Request[SslCert]
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SslCertsInsertResponse]
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SslCertsListResponse]
}

object SslCertsResource {
  @scala.inline
  def apply(
    createEphemeral: gapiDotClientDotSqladminLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[SslCert],
    delete: gapiDotClientDotSqladminLib.Anon_AltFieldsInstanceKey => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotSqladminLib.Anon_AltFieldsInstanceKey => gapiDotClientLib.gapiNs.clientNs.Request[SslCert],
    insert: gapiDotClientDotSqladminLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[SslCertsInsertResponse],
    list: gapiDotClientDotSqladminLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[SslCertsListResponse]
  ): SslCertsResource = {
    val __obj = js.Dynamic.literal(createEphemeral = js.Any.fromFunction1(createEphemeral), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SslCertsResource]
  }
}

