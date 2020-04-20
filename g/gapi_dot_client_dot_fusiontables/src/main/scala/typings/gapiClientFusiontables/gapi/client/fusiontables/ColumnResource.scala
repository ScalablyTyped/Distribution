package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonAlt
import typings.gapiClientFusiontables.AnonFields
import typings.gapiClientFusiontables.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResource extends js.Object {
  /** Deletes the specified column. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Retrieves a specific column by its ID. */
  def get(request: AnonAlt): Request_[Column]
  /** Adds a new column to the table. */
  def insert(request: AnonFields): Request_[Column]
  /** Retrieves a list of columns. */
  def list(request: AnonKey): Request_[ColumnList]
  /** Updates the name or type of an existing column. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[Column]
  /** Updates the name or type of an existing column. */
  def update(request: AnonAlt): Request_[Column]
}

object ColumnResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[Column],
    insert: AnonFields => Request_[Column],
    list: AnonKey => Request_[ColumnList],
    patch: AnonAlt => Request_[Column],
    update: AnonAlt => Request_[Column]
  ): ColumnResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ColumnResource]
  }
}

