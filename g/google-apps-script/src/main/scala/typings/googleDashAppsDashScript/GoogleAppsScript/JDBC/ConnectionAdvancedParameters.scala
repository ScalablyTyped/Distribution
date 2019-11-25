package typings.googleDashAppsDashScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** JdbcAdvancedParameters */
trait ConnectionAdvancedParameters extends js.Object {
  /** the client's SSL certificate */
  var _clientSslCertificate: js.UndefOr[String] = js.undefined
  /** the client's SSL key */
  var _clientSslKey: js.UndefOr[String] = js.undefined
  /** the server's SSL certificate */
  var _serverSslCertificate: js.UndefOr[String] = js.undefined
  /** the database to connect to */
  var databaseName: js.UndefOr[String] = js.undefined
  /** the user's password */
  var password: js.UndefOr[String] = js.undefined
  /** whether or not the connection should comply with JDBC rules when converting time zones. The default is false. */
  var useJDBCCompliantTimeZoneShift: js.UndefOr[Boolean] = js.undefined
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionAdvancedParameters {
  @scala.inline
  def apply(
    _clientSslCertificate: String = null,
    _clientSslKey: String = null,
    _serverSslCertificate: String = null,
    databaseName: String = null,
    password: String = null,
    useJDBCCompliantTimeZoneShift: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): ConnectionAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    if (_clientSslCertificate != null) __obj.updateDynamic("_clientSslCertificate")(_clientSslCertificate.asInstanceOf[js.Any])
    if (_clientSslKey != null) __obj.updateDynamic("_clientSslKey")(_clientSslKey.asInstanceOf[js.Any])
    if (_serverSslCertificate != null) __obj.updateDynamic("_serverSslCertificate")(_serverSslCertificate.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(useJDBCCompliantTimeZoneShift)) __obj.updateDynamic("useJDBCCompliantTimeZoneShift")(useJDBCCompliantTimeZoneShift.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAdvancedParameters]
  }
}

