package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBigquery.Anon_AltDatasetId
import typings.gapiDotClientDotBigquery.Anon_AltDatasetIdFields
import typings.gapiDotClientDotBigquery.Anon_AltDatasetIdFieldsKeyMaxResults
import typings.gapiDotClientDotBigquery.Anon_AltDatasetIdFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesResource extends js.Object {
  /** Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted. */
  def delete(request: Anon_AltDatasetIdFields): Request[Unit]
  /**
    * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes
    * the structure of this table.
    */
  def get(request: Anon_AltDatasetIdFieldsKeyOauthtoken): Request[Table]
  /** Creates a new, empty table in the dataset. */
  def insert(request: Anon_AltDatasetId): Request[Table]
  /** Lists all tables in the specified dataset. Requires the READER dataset role. */
  def list(request: Anon_AltDatasetIdFieldsKeyMaxResults): Request[TableList]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource. This method supports patch semantics.
    */
  def patch(request: Anon_AltDatasetIdFields): Request[Table]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource.
    */
  def update(request: Anon_AltDatasetIdFields): Request[Table]
}

object TablesResource {
  @scala.inline
  def apply(
    delete: Anon_AltDatasetIdFields => Request[Unit],
    get: Anon_AltDatasetIdFieldsKeyOauthtoken => Request[Table],
    insert: Anon_AltDatasetId => Request[Table],
    list: Anon_AltDatasetIdFieldsKeyMaxResults => Request[TableList],
    patch: Anon_AltDatasetIdFields => Request[Table],
    update: Anon_AltDatasetIdFields => Request[Table]
  ): TablesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TablesResource]
  }
}

