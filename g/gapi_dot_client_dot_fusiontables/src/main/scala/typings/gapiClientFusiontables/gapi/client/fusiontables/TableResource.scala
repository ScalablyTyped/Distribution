package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonAltCopyPresentation
import typings.gapiClientFusiontables.AnonAltDelimiter
import typings.gapiClientFusiontables.AnonAltDelimiterEncoding
import typings.gapiClientFusiontables.AnonAltFields
import typings.gapiClientFusiontables.AnonAltFieldsKeyMaxResults
import typings.gapiClientFusiontables.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientFusiontables.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResource extends js.Object {
  /** Copies a table. */
  def copy(request: AnonAltCopyPresentation): Request_[Table]
  /** Deletes a table. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Retrieves a specific table by its ID. */
  def get(request: AnonAltFields): Request_[Table]
  /** Imports more rows into a table. */
  def importRows(request: AnonAltDelimiter): Request_[Import]
  /** Imports a new table. */
  def importTable(request: AnonAltDelimiterEncoding): Request_[Table]
  /** Creates a new table. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Table]
  /** Retrieves a list of tables a user owns. */
  def list(request: AnonAltFieldsKeyMaxResults): Request_[TableList]
  /**
    * Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch
    * semantics.
    */
  def patch(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[Table]
  /** Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready. */
  def replaceRows(request: AnonAltDelimiter): Request_[Task]
  /** Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. */
  def update(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[Table]
}

object TableResource {
  @scala.inline
  def apply(
    copy: AnonAltCopyPresentation => Request_[Table],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[Table],
    importRows: AnonAltDelimiter => Request_[Import],
    importTable: AnonAltDelimiterEncoding => Request_[Table],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Table],
    list: AnonAltFieldsKeyMaxResults => Request_[TableList],
    patch: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request_[Table],
    replaceRows: AnonAltDelimiter => Request_[Task],
    update: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request_[Table]
  ): TableResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), importRows = js.Any.fromFunction1(importRows), importTable = js.Any.fromFunction1(importTable), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), replaceRows = js.Any.fromFunction1(replaceRows), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TableResource]
  }
}

