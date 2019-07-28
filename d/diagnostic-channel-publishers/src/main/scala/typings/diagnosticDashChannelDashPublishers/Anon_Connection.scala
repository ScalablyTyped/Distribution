package typings.diagnosticDashChannelDashPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var _connection: js.UndefOr[Anon_Config] = js.undefined
  var sql: js.UndefOr[String] = js.undefined
}

object Anon_Connection {
  @scala.inline
  def apply(_connection: Anon_Config = null, sql: String = null): Anon_Connection = {
    val __obj = js.Dynamic.literal()
    if (_connection != null) __obj.updateDynamic("_connection")(_connection)
    if (sql != null) __obj.updateDynamic("sql")(sql)
    __obj.asInstanceOf[Anon_Connection]
  }
}

