package typings
package atFirebaseDatabaseLib.distSrcApiDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/Database", "DatabaseInternals")
@js.native
class DatabaseInternals protected () extends js.Object {
  /** @param {!Database} database */
  def this(database: Database) = this()
  var database: Database = js.native
  /** @return {Promise<void>} */
  def delete(): stdLib.Promise[scala.Unit] = js.native
}

