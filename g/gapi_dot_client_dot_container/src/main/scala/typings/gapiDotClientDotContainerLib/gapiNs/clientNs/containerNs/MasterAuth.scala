package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasterAuth extends js.Object {
  /**
    * [Output only] Base64-encoded public certificate used by clients to
    * authenticate to the cluster endpoint.
    */
  var clientCertificate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Configuration for client certificate authentication on the cluster.  If no
    * configuration is specified, a client certificate is issued.
    */
  var clientCertificateConfig: js.UndefOr[ClientCertificateConfig] = js.undefined
  /**
    * [Output only] Base64-encoded private key used by clients to authenticate
    * to the cluster endpoint.
    */
  var clientKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] Base64-encoded public certificate that is the root of
    * trust for the cluster.
    */
  var clusterCaCertificate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The password to use for HTTP basic authentication to the master endpoint.
    * Because the master endpoint is open to the Internet, you should create a
    * strong password.  If a password is provided for cluster creation, username
    * must be non-empty.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The username to use for HTTP basic authentication to the master endpoint.
    * For clusters v1.6.0 and later, you can disable basic authentication by
    * providing an empty username.
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

