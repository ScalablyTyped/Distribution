package typings.expressMysqlSession.mod

import typings.expressMysqlSession.anon.PartialSchema
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
  var schema: js.UndefOr[PartialSchema] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    checkExpirationInterval: js.UndefOr[Double] = js.undefined,
    connectionLimit: js.UndefOr[Double] = js.undefined,
    createDatabaseTable: js.UndefOr[Boolean] = js.undefined,
    database: String = null,
    expiration: js.UndefOr[Double] = js.undefined,
    host: String = null,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    schema: PartialSchema = null,
    user: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkExpirationInterval)) __obj.updateDynamic("checkExpirationInterval")(checkExpirationInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionLimit)) __obj.updateDynamic("connectionLimit")(connectionLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createDatabaseTable)) __obj.updateDynamic("createDatabaseTable")(createDatabaseTable.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(expiration)) __obj.updateDynamic("expiration")(expiration.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

