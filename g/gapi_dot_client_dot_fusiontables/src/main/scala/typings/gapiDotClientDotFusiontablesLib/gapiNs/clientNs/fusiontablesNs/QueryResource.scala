package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResource extends js.Object {
  /**
    * Executes a Fusion Tables SQL statement, which can be any of
    * - SELECT
    * - INSERT
    * - UPDATE
    * - DELETE
    * - SHOW
    * - DESCRIBE
    * - CREATE statement.
    */
  def sql(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsHdrs): gapiDotClientLib.gapiNs.clientNs.Request[Sqlresponse]
  /**
    * Executes a SQL statement which can be any of
    * - SELECT
    * - SHOW
    * - DESCRIBE
    */
  def sqlGet(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsHdrs): gapiDotClientLib.gapiNs.clientNs.Request[Sqlresponse]
}

object QueryResource {
  @scala.inline
  def apply(
    sql: gapiDotClientDotFusiontablesLib.Anon_AltFieldsHdrs => gapiDotClientLib.gapiNs.clientNs.Request[Sqlresponse],
    sqlGet: gapiDotClientDotFusiontablesLib.Anon_AltFieldsHdrs => gapiDotClientLib.gapiNs.clientNs.Request[Sqlresponse]
  ): QueryResource = {
    val __obj = js.Dynamic.literal(sql = js.Any.fromFunction1(sql), sqlGet = js.Any.fromFunction1(sqlGet))
  
    __obj.asInstanceOf[QueryResource]
  }
}

