package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquery.AnonAll
import typings.gapiClientBigquery.AnonAlt
import typings.gapiClientBigquery.AnonDatasetId
import typings.gapiClientBigquery.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsResource extends js.Object {
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying
    * deleteContents. Immediately after deletion, you can create another dataset with the same name.
    */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns the dataset specified by datasetID. */
  def get(request: AnonDatasetId): Request_[Dataset]
  /** Creates a new empty dataset. */
  def insert(request: AnonFields): Request_[Dataset]
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(request: AnonAll): Request_[DatasetList]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource. This method supports patch semantics.
    */
  def patch(request: AnonDatasetId): Request_[Dataset]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource.
    */
  def update(request: AnonDatasetId): Request_[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonDatasetId => Request_[Dataset],
    insert: AnonFields => Request_[Dataset],
    list: AnonAll => Request_[DatasetList],
    patch: AnonDatasetId => Request_[Dataset],
    update: AnonDatasetId => Request_[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatasetsResource]
  }
}

