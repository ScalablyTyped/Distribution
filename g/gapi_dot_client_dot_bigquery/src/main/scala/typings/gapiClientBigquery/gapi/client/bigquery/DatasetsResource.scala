package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquery.anon.All
import typings.gapiClientBigquery.anon.Alt
import typings.gapiClientBigquery.anon.DatasetId
import typings.gapiClientBigquery.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsResource extends js.Object {
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying
    * deleteContents. Immediately after deletion, you can create another dataset with the same name.
    */
  def delete(request: Alt): Request[Unit]
  /** Returns the dataset specified by datasetID. */
  def get(request: DatasetId): Request[Dataset]
  /** Creates a new empty dataset. */
  def insert(request: Fields): Request[Dataset]
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(request: All): Request[DatasetList]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource. This method supports patch semantics.
    */
  def patch(request: DatasetId): Request[Dataset]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource.
    */
  def update(request: DatasetId): Request[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: DatasetId => Request[Dataset],
    insert: Fields => Request[Dataset],
    list: All => Request[DatasetList],
    patch: DatasetId => Request[Dataset],
    update: DatasetId => Request[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatasetsResource]
  }
}

