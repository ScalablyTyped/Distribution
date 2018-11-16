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
  def sql(request: gapiDotClientDotFusiontablesLib.Anon_Sql): gapiDotClientLib.gapiNs.clientNs.Request[Sqlresponse]
  /**
               * Executes a SQL statement which can be any of
               * - SELECT
               * - SHOW
               * - DESCRIBE
               */
  def sqlGet(request: gapiDotClientDotFusiontablesLib.Anon_Sql): gapiDotClientLib.gapiNs.clientNs.Request[Sqlresponse]
}

