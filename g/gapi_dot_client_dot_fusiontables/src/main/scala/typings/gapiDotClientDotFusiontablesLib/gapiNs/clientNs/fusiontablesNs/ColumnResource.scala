package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResource extends js.Object {
  /** Deletes the specified column. */
  def delete(request: gapiDotClientDotFusiontablesLib.Anon_PrettyPrintColumnId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a specific column by its ID. */
  def get(request: gapiDotClientDotFusiontablesLib.Anon_PrettyPrintColumnId): gapiDotClientLib.gapiNs.clientNs.Request[Column]
  /** Adds a new column to the table. */
  def insert(request: gapiDotClientDotFusiontablesLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Column]
  /** Retrieves a list of columns. */
  def list(request: gapiDotClientDotFusiontablesLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[ColumnList]
  /** Updates the name or type of an existing column. This method supports patch semantics. */
  def patch(request: gapiDotClientDotFusiontablesLib.Anon_PrettyPrintColumnId): gapiDotClientLib.gapiNs.clientNs.Request[Column]
  /** Updates the name or type of an existing column. */
  def update(request: gapiDotClientDotFusiontablesLib.Anon_PrettyPrintColumnId): gapiDotClientLib.gapiNs.clientNs.Request[Column]
}

