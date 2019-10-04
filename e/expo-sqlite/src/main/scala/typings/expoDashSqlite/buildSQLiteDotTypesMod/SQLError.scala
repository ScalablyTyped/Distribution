package typings.expoDashSqlite.buildSQLiteDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-sqlite/build/SQLite.types", "SQLError")
@js.native
class SQLError () extends js.Object {
  var code: Double = js.native
  var message: String = js.native
}

/* static members */
@JSImport("expo-sqlite/build/SQLite.types", "SQLError")
@js.native
object SQLError extends js.Object {
  var CONSTRAINT_ERR: Double = js.native
  var DATABASE_ERR: Double = js.native
  var QUOTA_ERR: Double = js.native
  var SYNTAX_ERR: Double = js.native
  var TIMEOUT_ERR: Double = js.native
  var TOO_LARGE_ERR: Double = js.native
  var UNKNOWN_ERR: Double = js.native
  var VERSION_ERR: Double = js.native
}

