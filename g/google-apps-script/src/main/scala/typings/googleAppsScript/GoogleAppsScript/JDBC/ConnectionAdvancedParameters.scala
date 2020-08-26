package typings.googleAppsScript.GoogleAppsScript.JDBC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** JdbcAdvancedParameters */
@js.native
trait ConnectionAdvancedParameters extends js.Object {
  /** the client's SSL certificate */
  var _clientSslCertificate: js.UndefOr[String] = js.native
  /** the client's SSL key */
  var _clientSslKey: js.UndefOr[String] = js.native
  /** the server's SSL certificate */
  var _serverSslCertificate: js.UndefOr[String] = js.native
  /** the database to connect to */
  var databaseName: js.UndefOr[String] = js.native
  /** the user's password */
  var password: js.UndefOr[String] = js.native
  /** whether or not the connection should comply with JDBC rules when converting time zones. The default is false. */
  var useJDBCCompliantTimeZoneShift: js.UndefOr[Boolean] = js.native
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.native
}

object ConnectionAdvancedParameters {
  @scala.inline
  def apply(): ConnectionAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAdvancedParameters]
  }
  @scala.inline
  implicit class ConnectionAdvancedParametersOps[Self <: ConnectionAdvancedParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_clientSslCertificate(value: String): Self = this.set("_clientSslCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_clientSslCertificate: Self = this.set("_clientSslCertificate", js.undefined)
    @scala.inline
    def set_clientSslKey(value: String): Self = this.set("_clientSslKey", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_clientSslKey: Self = this.set("_clientSslKey", js.undefined)
    @scala.inline
    def set_serverSslCertificate(value: String): Self = this.set("_serverSslCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_serverSslCertificate: Self = this.set("_serverSslCertificate", js.undefined)
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setUseJDBCCompliantTimeZoneShift(value: Boolean): Self = this.set("useJDBCCompliantTimeZoneShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseJDBCCompliantTimeZoneShift: Self = this.set("useJDBCCompliantTimeZoneShift", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

