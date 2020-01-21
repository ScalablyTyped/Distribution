package typings.expressMysqlSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var checkExpirationInterval: js.UndefOr[Double] = js.undefined
  var connectionLimit: js.UndefOr[Double] = js.undefined
  var createDatabaseTable: js.UndefOr[Boolean] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var expiration: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var schema: js.UndefOr[Schema] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    checkExpirationInterval: Int | Double = null,
    connectionLimit: Int | Double = null,
    createDatabaseTable: js.UndefOr[Boolean] = js.undefined,
    database: String = null,
    expiration: Int | Double = null,
    host: String = null,
    password: String = null,
    port: Int | Double = null,
    schema: Schema = null,
    user: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (checkExpirationInterval != null) __obj.updateDynamic("checkExpirationInterval")(checkExpirationInterval.asInstanceOf[js.Any])
    if (connectionLimit != null) __obj.updateDynamic("connectionLimit")(connectionLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(createDatabaseTable)) __obj.updateDynamic("createDatabaseTable")(createDatabaseTable.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

