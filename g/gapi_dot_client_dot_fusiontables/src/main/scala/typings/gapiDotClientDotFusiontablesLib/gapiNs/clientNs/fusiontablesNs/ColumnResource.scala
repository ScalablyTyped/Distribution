package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResource extends js.Object {
  /** Deletes the specified column. */
  def delete(request: gapiDotClientDotFusiontablesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a specific column by its ID. */
  def get(request: gapiDotClientDotFusiontablesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Column]
  /** Adds a new column to the table. */
  def insert(request: gapiDotClientDotFusiontablesLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Column]
  /** Retrieves a list of columns. */
  def list(request: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ColumnList]
  /** Updates the name or type of an existing column. This method supports patch semantics. */
  def patch(request: gapiDotClientDotFusiontablesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Column]
  /** Updates the name or type of an existing column. */
  def update(request: gapiDotClientDotFusiontablesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Column]
}

object ColumnResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotFusiontablesLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotFusiontablesLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Column],
    insert: gapiDotClientDotFusiontablesLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Column],
    list: gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ColumnList],
    patch: gapiDotClientDotFusiontablesLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Column],
    update: gapiDotClientDotFusiontablesLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Column]
  ): ColumnResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ColumnResource]
  }
}

