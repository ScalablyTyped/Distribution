package typings.diagnosticChannelPublishers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var _connection: js.UndefOr[Config] = js.undefined
  var sql: js.UndefOr[String] = js.undefined
}

object Connection {
  @scala.inline
  def apply(_connection: Config = null, sql: String = null): Connection = {
    val __obj = js.Dynamic.literal()
    if (_connection != null) __obj.updateDynamic("_connection")(_connection.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

