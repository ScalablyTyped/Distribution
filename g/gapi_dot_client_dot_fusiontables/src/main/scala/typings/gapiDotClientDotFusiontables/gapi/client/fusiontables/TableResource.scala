package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFusiontables.Anon_AltCopyPresentation
import typings.gapiDotClientDotFusiontables.Anon_AltDelimiter
import typings.gapiDotClientDotFusiontables.Anon_AltDelimiterEncoding
import typings.gapiDotClientDotFusiontables.Anon_AltFields
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKeyMaxResults
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResource extends js.Object {
  /** Copies a table. */
  def copy(request: Anon_AltCopyPresentation): Request[Table]
  /** Deletes a table. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Retrieves a specific table by its ID. */
  def get(request: Anon_AltFields): Request[Table]
  /** Imports more rows into a table. */
  def importRows(request: Anon_AltDelimiter): Request[Import]
  /** Imports a new table. */
  def importTable(request: Anon_AltDelimiterEncoding): Request[Table]
  /** Creates a new table. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Table]
  /** Retrieves a list of tables a user owns. */
  def list(request: Anon_AltFieldsKeyMaxResults): Request[TableList]
  /**
    * Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch
    * semantics.
    */
  def patch(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[Table]
  /** Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready. */
  def replaceRows(request: Anon_AltDelimiter): Request[Task]
  /** Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. */
  def update(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[Table]
}

object TableResource {
  @scala.inline
  def apply(
    copy: Anon_AltCopyPresentation => Request[Table],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Table],
    importRows: Anon_AltDelimiter => Request[Import],
    importTable: Anon_AltDelimiterEncoding => Request[Table],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Table],
    list: Anon_AltFieldsKeyMaxResults => Request[TableList],
    patch: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request[Table],
    replaceRows: Anon_AltDelimiter => Request[Task],
    update: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request[Table]
  ): TableResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), importRows = js.Any.fromFunction1(importRows), importTable = js.Any.fromFunction1(importTable), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), replaceRows = js.Any.fromFunction1(replaceRows), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TableResource]
  }
}

