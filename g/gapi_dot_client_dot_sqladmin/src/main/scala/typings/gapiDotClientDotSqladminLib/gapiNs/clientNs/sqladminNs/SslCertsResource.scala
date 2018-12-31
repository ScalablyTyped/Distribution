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
  def createEphemeral(request: gapiDotClientDotSqladminLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[SslCert]
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: gapiDotClientDotSqladminLib.Anon_ProjectPrettyPrintInstance): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: gapiDotClientDotSqladminLib.Anon_ProjectPrettyPrintInstance): gapiDotClientLib.gapiNs.clientNs.Request[SslCert]
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: gapiDotClientDotSqladminLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[SslCertsInsertResponse]
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: gapiDotClientDotSqladminLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[SslCertsListResponse]
}

