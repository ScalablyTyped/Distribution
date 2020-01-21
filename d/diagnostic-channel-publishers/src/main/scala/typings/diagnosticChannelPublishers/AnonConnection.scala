package typings.diagnosticChannelPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnection extends js.Object {
  var _connection: js.UndefOr[AnonConfig] = js.undefined
  var sql: js.UndefOr[String] = js.undefined
}

object AnonConnection {
  @scala.inline
  def apply(_connection: AnonConfig = null, sql: String = null): AnonConnection = {
    val __obj = js.Dynamic.literal()
    if (_connection != null) __obj.updateDynamic("_connection")(_connection.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnection]
  }
}

