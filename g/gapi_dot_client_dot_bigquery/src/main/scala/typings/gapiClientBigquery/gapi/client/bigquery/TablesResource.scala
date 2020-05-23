package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquery.anon.DatasetId
import typings.gapiClientBigquery.anon.Oauthtoken
import typings.gapiClientBigquery.anon.PrettyPrint
import typings.gapiClientBigquery.anon.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesResource extends js.Object {
  /** Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted. */
  def delete(request: Oauthtoken): Request[Unit]
  /**
    * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes
    * the structure of this table.
    */
  def get(request: PrettyPrint): Request[Table]
  /** Creates a new, empty table in the dataset. */
  def insert(request: DatasetId): Request[Table]
  /** Lists all tables in the specified dataset. Requires the READER dataset role. */
  def list(request: ProjectId): Request[TableList]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource. This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Table]
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource.
    */
  def update(request: Oauthtoken): Request[Table]
}

object TablesResource {
  @scala.inline
  def apply(
    delete: Oauthtoken => Request[Unit],
    get: PrettyPrint => Request[Table],
    insert: DatasetId => Request[Table],
    list: ProjectId => Request[TableList],
    patch: Oauthtoken => Request[Table],
    update: Oauthtoken => Request[Table]
  ): TablesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TablesResource]
  }
}

