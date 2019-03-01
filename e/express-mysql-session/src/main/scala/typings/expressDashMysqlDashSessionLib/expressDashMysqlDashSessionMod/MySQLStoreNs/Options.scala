package typings
package expressDashMysqlDashSessionLib.expressDashMysqlDashSessionMod.MySQLStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var checkExpirationInterval: js.UndefOr[scala.Double] = js.undefined
  var connectionLimit: js.UndefOr[scala.Double] = js.undefined
  var createDatabaseTable: js.UndefOr[scala.Boolean] = js.undefined
  var database: js.UndefOr[java.lang.String] = js.undefined
  var expiration: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var schema: js.UndefOr[Schema] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    checkExpirationInterval: scala.Int | scala.Double = null,
    connectionLimit: scala.Int | scala.Double = null,
    createDatabaseTable: js.UndefOr[scala.Boolean] = js.undefined,
    database: java.lang.String = null,
    expiration: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    schema: Schema = null,
    user: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (checkExpirationInterval != null) __obj.updateDynamic("checkExpirationInterval")(checkExpirationInterval.asInstanceOf[js.Any])
    if (connectionLimit != null) __obj.updateDynamic("connectionLimit")(connectionLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(createDatabaseTable)) __obj.updateDynamic("createDatabaseTable")(createDatabaseTable)
    if (database != null) __obj.updateDynamic("database")(database)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Options]
  }
}

