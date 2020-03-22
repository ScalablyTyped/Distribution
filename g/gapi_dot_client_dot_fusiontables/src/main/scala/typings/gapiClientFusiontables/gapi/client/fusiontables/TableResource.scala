package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonCopyPresentation
import typings.gapiClientFusiontables.AnonDelimiter
import typings.gapiClientFusiontables.AnonEncoding
import typings.gapiClientFusiontables.AnonFields
import typings.gapiClientFusiontables.AnonMaxResults
import typings.gapiClientFusiontables.AnonPrettyPrint
import typings.gapiClientFusiontables.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResource extends js.Object {
  /** Copies a table. */
  def copy(request: AnonCopyPresentation): Request_[Table]
  /** Deletes a table. */
  def delete(request: AnonFields): Request_[Unit]
  /** Retrieves a specific table by its ID. */
  def get(request: AnonFields): Request_[Table]
  /** Imports more rows into a table. */
  def importRows(request: AnonDelimiter): Request_[Import]
  /** Imports a new table. */
  def importTable(request: AnonEncoding): Request_[Table]
  /** Creates a new table. */
  def insert(request: AnonPrettyPrint): Request_[Table]
  /** Retrieves a list of tables a user owns. */
  def list(request: AnonMaxResults): Request_[TableList]
  /**
    * Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch
    * semantics.
    */
  def patch(request: AnonQuotaUser): Request_[Table]
  /** Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready. */
  def replaceRows(request: AnonDelimiter): Request_[Task]
  /** Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. */
  def update(request: AnonQuotaUser): Request_[Table]
}

object TableResource {
  @scala.inline
  def apply(
    copy: AnonCopyPresentation => Request_[Table],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Table],
    importRows: AnonDelimiter => Request_[Import],
    importTable: AnonEncoding => Request_[Table],
    insert: AnonPrettyPrint => Request_[Table],
    list: AnonMaxResults => Request_[TableList],
    patch: AnonQuotaUser => Request_[Table],
    replaceRows: AnonDelimiter => Request_[Task],
    update: AnonQuotaUser => Request_[Table]
  ): TableResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), importRows = js.Any.fromFunction1(importRows), importTable = js.Any.fromFunction1(importTable), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), replaceRows = js.Any.fromFunction1(replaceRows), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TableResource]
  }
}

