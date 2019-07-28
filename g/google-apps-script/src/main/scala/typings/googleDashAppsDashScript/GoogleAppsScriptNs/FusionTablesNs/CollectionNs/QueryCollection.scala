package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FusionTablesNs.SchemaNs.Sqlresponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryCollection extends js.Object {
  // Executes a Fusion Tables SQL statement, which can be any of
  // - SELECT
  // - INSERT
  // - UPDATE
  // - DELETE
  // - SHOW
  // - DESCRIBE
  // - CREATE statement.
  def sql(sql: String): Sqlresponse = js.native
  // Executes a Fusion Tables SQL statement, which can be any of
  // - SELECT
  // - INSERT
  // - UPDATE
  // - DELETE
  // - SHOW
  // - DESCRIBE
  // - CREATE statement.
  def sql(sql: String, optionalArgs: js.Object): Sqlresponse = js.native
  // Executes a SQL statement which can be any of
  // - SELECT
  // - SHOW
  // - DESCRIBE
  def sqlGet(sql: String): Sqlresponse = js.native
  // Executes a SQL statement which can be any of
  // - SELECT
  // - SHOW
  // - DESCRIBE
  def sqlGet(sql: String, optionalArgs: js.Object): Sqlresponse = js.native
}

