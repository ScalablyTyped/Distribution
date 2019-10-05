package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFusiontables.Anon_Alt
import typings.gapiDotClientDotFusiontables.Anon_AltFields
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResource extends js.Object {
  /** Deletes the specified column. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Retrieves a specific column by its ID. */
  def get(request: Anon_Alt): Request[Column]
  /** Adds a new column to the table. */
  def insert(request: Anon_AltFields): Request[Column]
  /** Retrieves a list of columns. */
  def list(request: Anon_AltFieldsKey): Request[ColumnList]
  /** Updates the name or type of an existing column. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[Column]
  /** Updates the name or type of an existing column. */
  def update(request: Anon_Alt): Request[Column]
}

object ColumnResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[Column],
    insert: Anon_AltFields => Request[Column],
    list: Anon_AltFieldsKey => Request[ColumnList],
    patch: Anon_Alt => Request[Column],
    update: Anon_Alt => Request[Column]
  ): ColumnResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ColumnResource]
  }
}

