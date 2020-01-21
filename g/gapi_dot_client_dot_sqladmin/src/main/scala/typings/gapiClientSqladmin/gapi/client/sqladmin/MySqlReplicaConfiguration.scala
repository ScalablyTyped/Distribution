package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MySqlReplicaConfiguration extends js.Object {
  /** PEM representation of the trusted CA's x509 certificate. */
  var caCertificate: js.UndefOr[String] = js.undefined
  /** PEM representation of the slave's x509 certificate. */
  var clientCertificate: js.UndefOr[String] = js.undefined
  /** PEM representation of the slave's private key. The corresponsing public key is encoded in the client's certificate. */
  var clientKey: js.UndefOr[String] = js.undefined
  /** Seconds to wait between connect retries. MySQL's default is 60 seconds. */
  var connectRetryInterval: js.UndefOr[Double] = js.undefined
  /**
    * Path to a SQL dump file in Google Cloud Storage from which the slave instance is to be created. The URI is in the form gs://bucketName/fileName.
    * Compressed gzip files (.gz) are also supported. Dumps should have the binlog co-ordinates from which replication should begin. This can be accomplished
    * by setting --master-data to 1 when using mysqldump.
    */
  var dumpFilePath: js.UndefOr[String] = js.undefined
  /** This is always sql#mysqlReplicaConfiguration. */
  var kind: js.UndefOr[String] = js.undefined
  /** Interval in milliseconds between replication heartbeats. */
  var masterHeartbeatPeriod: js.UndefOr[String] = js.undefined
  /** The password for the replication connection. */
  var password: js.UndefOr[String] = js.undefined
  /** A list of permissible ciphers to use for SSL encryption. */
  var sslCipher: js.UndefOr[String] = js.undefined
  /** The username for the replication connection. */
  var username: js.UndefOr[String] = js.undefined
  /** Whether or not to check the master's Common Name value in the certificate that it sends during the SSL handshake. */
  var verifyServerCertificate: js.UndefOr[Boolean] = js.undefined
}

object MySqlReplicaConfiguration {
  @scala.inline
  def apply(
    caCertificate: String = null,
    clientCertificate: String = null,
    clientKey: String = null,
    connectRetryInterval: Int | Double = null,
    dumpFilePath: String = null,
    kind: String = null,
    masterHeartbeatPeriod: String = null,
    password: String = null,
    sslCipher: String = null,
    username: String = null,
    verifyServerCertificate: js.UndefOr[Boolean] = js.undefined
  ): MySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    if (caCertificate != null) __obj.updateDynamic("caCertificate")(caCertificate.asInstanceOf[js.Any])
    if (clientCertificate != null) __obj.updateDynamic("clientCertificate")(clientCertificate.asInstanceOf[js.Any])
    if (clientKey != null) __obj.updateDynamic("clientKey")(clientKey.asInstanceOf[js.Any])
    if (connectRetryInterval != null) __obj.updateDynamic("connectRetryInterval")(connectRetryInterval.asInstanceOf[js.Any])
    if (dumpFilePath != null) __obj.updateDynamic("dumpFilePath")(dumpFilePath.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (masterHeartbeatPeriod != null) __obj.updateDynamic("masterHeartbeatPeriod")(masterHeartbeatPeriod.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (sslCipher != null) __obj.updateDynamic("sslCipher")(sslCipher.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyServerCertificate)) __obj.updateDynamic("verifyServerCertificate")(verifyServerCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MySqlReplicaConfiguration]
  }
}

