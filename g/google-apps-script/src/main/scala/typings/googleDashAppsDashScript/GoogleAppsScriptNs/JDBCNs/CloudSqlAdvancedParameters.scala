package typings.googleDashAppsDashScript.GoogleAppsScriptNs.JDBCNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudSqlAdvancedParameters extends js.Object {
  /** connection timeout in seconds */
  var connectTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  /** the database to connect to */
  var database: js.UndefOr[String] = js.undefined
  /** the name of a Google SQL Service instance */
  var instance: js.UndefOr[String] = js.undefined
  /** the user's password */
  var password: js.UndefOr[String] = js.undefined
  /** query timeout in seconds */
  var queryTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.undefined
}

object CloudSqlAdvancedParameters {
  @scala.inline
  def apply(
    connectTimeoutSeconds: js.UndefOr[Integer] = js.undefined,
    database: String = null,
    instance: String = null,
    password: String = null,
    queryTimeoutSeconds: js.UndefOr[Integer] = js.undefined,
    user: String = null
  ): CloudSqlAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connectTimeoutSeconds)) __obj.updateDynamic("connectTimeoutSeconds")(connectTimeoutSeconds)
    if (database != null) __obj.updateDynamic("database")(database)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(queryTimeoutSeconds)) __obj.updateDynamic("queryTimeoutSeconds")(queryTimeoutSeconds)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[CloudSqlAdvancedParameters]
  }
}

