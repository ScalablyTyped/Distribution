package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.CopyPresentation
import typings.gapiClientFusiontables.anon.Delimiter
import typings.gapiClientFusiontables.anon.Encoding
import typings.gapiClientFusiontables.anon.Fields
import typings.gapiClientFusiontables.anon.MaxResults
import typings.gapiClientFusiontables.anon.PrettyPrint
import typings.gapiClientFusiontables.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResource extends js.Object {
  /** Copies a table. */
  def copy(request: CopyPresentation): Request[Table]
  /** Deletes a table. */
  def delete(request: Fields): Request[Unit]
  /** Retrieves a specific table by its ID. */
  def get(request: Fields): Request[Table]
  /** Imports more rows into a table. */
  def importRows(request: Delimiter): Request[Import]
  /** Imports a new table. */
  def importTable(request: Encoding): Request[Table]
  /** Creates a new table. */
  def insert(request: PrettyPrint): Request[Table]
  /** Retrieves a list of tables a user owns. */
  def list(request: MaxResults): Request[TableList]
  /**
    * Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch
    * semantics.
    */
  def patch(request: QuotaUser): Request[Table]
  /** Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready. */
  def replaceRows(request: Delimiter): Request[Task]
  /** Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. */
  def update(request: QuotaUser): Request[Table]
}

object TableResource {
  @scala.inline
  def apply(
    copy: CopyPresentation => Request[Table],
    delete: Fields => Request[Unit],
    get: Fields => Request[Table],
    importRows: Delimiter => Request[Import],
    importTable: Encoding => Request[Table],
    insert: PrettyPrint => Request[Table],
    list: MaxResults => Request[TableList],
    patch: QuotaUser => Request[Table],
    replaceRows: Delimiter => Request[Task],
    update: QuotaUser => Request[Table]
  ): TableResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), importRows = js.Any.fromFunction1(importRows), importTable = js.Any.fromFunction1(importTable), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), replaceRows = js.Any.fromFunction1(replaceRows), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TableResource]
  }
}

