package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** JdbcAdvancedParameters */
@js.native
trait CloudSqlAdvancedParameters extends js.Object {
  /** connection timeout in seconds */
  var connectTimeoutSeconds: js.UndefOr[Integer] = js.native
  /** the database to connect to */
  var database: js.UndefOr[String] = js.native
  /** the name of a Google SQL Service instance */
  var instance: js.UndefOr[String] = js.native
  /** the user's password */
  var password: js.UndefOr[String] = js.native
  /** query timeout in seconds */
  var queryTimeoutSeconds: js.UndefOr[Integer] = js.native
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.native
}

object CloudSqlAdvancedParameters {
  @scala.inline
  def apply(): CloudSqlAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlAdvancedParameters]
  }
  @scala.inline
  implicit class CloudSqlAdvancedParametersOps[Self <: CloudSqlAdvancedParameters] (val x: Self) extends AnyVal {
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
    def setConnectTimeoutSeconds(value: Integer): Self = this.set("connectTimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectTimeoutSeconds: Self = this.set("connectTimeoutSeconds", js.undefined)
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setQueryTimeoutSeconds(value: Integer): Self = this.set("queryTimeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryTimeoutSeconds: Self = this.set("queryTimeoutSeconds", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

