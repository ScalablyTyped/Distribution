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
    delete: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Column]
    ],
    insert: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Column]
    ],
    list: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ColumnList]
    ],
    patch: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Column]
    ],
    update: js.Function1[
      gapiDotClientDotFusiontablesLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Column]
    ]
  ): ColumnResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[ColumnResource]
  }
}

