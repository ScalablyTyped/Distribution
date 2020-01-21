package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquery.AnonAltDatasetId
import typings.gapiClientBigquery.AnonAltDatasetIdFields
import typings.gapiClientBigquery.AnonAltDatasetIdFieldsKeyMaxResults
import typings.gapiClientBigquery.AnonAltDatasetIdFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesResource extends js.Object {
  /** Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted. */
  def delete(request: AnonAltDatasetIdFields): Request_[Unit]
  /**
    * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes
    * the structure of this table.
    */
  def get(request: AnonAltDatasetIdFieldsKeyOauthtoken): Request_[Table]
  /** Creates a new, empty table in the dataset. */
  def insert(request: AnonAltDatasetId): Request_[Table]
  /** Lists all tables in the specified dataset. Requires the READER dataset role. */
  def list(request: AnonAltDatasetIdFieldsKeyMaxResults): Request_[TableList]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource. This method supports patch semantics.
    */
  def patch(request: AnonAltDatasetIdFields): Request_[Table]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource.
    */
  def update(request: AnonAltDatasetIdFields): Request_[Table]
}

object TablesResource {
  @scala.inline
  def apply(
    delete: AnonAltDatasetIdFields => Request_[Unit],
    get: AnonAltDatasetIdFieldsKeyOauthtoken => Request_[Table],
    insert: AnonAltDatasetId => Request_[Table],
    list: AnonAltDatasetIdFieldsKeyMaxResults => Request_[TableList],
    patch: AnonAltDatasetIdFields => Request_[Table],
    update: AnonAltDatasetIdFields => Request_[Table]
  ): TablesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TablesResource]
  }
}

