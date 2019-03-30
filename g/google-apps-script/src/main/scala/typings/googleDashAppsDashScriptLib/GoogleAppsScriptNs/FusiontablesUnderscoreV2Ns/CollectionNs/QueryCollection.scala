package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.CollectionNs

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
  def sql(sql: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Sqlresponse = js.native
  // Executes a Fusion Tables SQL statement, which can be any of
  // - SELECT
  // - INSERT
  // - UPDATE
  // - DELETE
  // - SHOW
  // - DESCRIBE
  // - CREATE statement.
  def sql(sql: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Sqlresponse = js.native
  // Executes a SQL statement which can be any of
  // - SELECT
  // - SHOW
  // - DESCRIBE
  def sqlGet(sql: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Sqlresponse = js.native
  // Executes a SQL statement which can be any of
  // - SELECT
  // - SHOW
  // - DESCRIBE
  def sqlGet(sql: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusiontablesUnderscoreV2Ns.SchemaNs.Sqlresponse = js.native
}

