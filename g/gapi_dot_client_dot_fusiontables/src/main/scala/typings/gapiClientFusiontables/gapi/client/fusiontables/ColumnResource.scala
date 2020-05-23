package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.Alt
import typings.gapiClientFusiontables.anon.Fields
import typings.gapiClientFusiontables.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResource extends js.Object {
  /** Deletes the specified column. */
  def delete(request: Alt): Request[Unit]
  /** Retrieves a specific column by its ID. */
  def get(request: Alt): Request[Column]
  /** Adds a new column to the table. */
  def insert(request: Fields): Request[Column]
  /** Retrieves a list of columns. */
  def list(request: Key): Request[ColumnList]
  /** Updates the name or type of an existing column. This method supports patch semantics. */
  def patch(request: Alt): Request[Column]
  /** Updates the name or type of an existing column. */
  def update(request: Alt): Request[Column]
}

object ColumnResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[Column],
    insert: Fields => Request[Column],
    list: Key => Request[ColumnList],
    patch: Alt => Request[Column],
    update: Alt => Request[Column]
  ): ColumnResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ColumnResource]
  }
}

