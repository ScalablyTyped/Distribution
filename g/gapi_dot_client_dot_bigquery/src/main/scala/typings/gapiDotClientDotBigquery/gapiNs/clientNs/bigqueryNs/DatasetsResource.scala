package typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBigquery.Anon_All
import typings.gapiDotClientDotBigquery.Anon_Alt
import typings.gapiDotClientDotBigquery.Anon_AltDatasetId
import typings.gapiDotClientDotBigquery.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsResource extends js.Object {
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying
    * deleteContents. Immediately after deletion, you can create another dataset with the same name.
    */
  def delete(request: Anon_Alt): Request[Unit]
  /** Returns the dataset specified by datasetID. */
  def get(request: Anon_AltDatasetId): Request[Dataset]
  /** Creates a new empty dataset. */
  def insert(request: Anon_AltFields): Request[Dataset]
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(request: Anon_All): Request[DatasetList]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource. This method supports patch semantics.
    */
  def patch(request: Anon_AltDatasetId): Request[Dataset]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource.
    */
  def update(request: Anon_AltDatasetId): Request[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_AltDatasetId => Request[Dataset],
    insert: Anon_AltFields => Request[Dataset],
    list: Anon_All => Request[DatasetList],
    patch: Anon_AltDatasetId => Request[Dataset],
    update: Anon_AltDatasetId => Request[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatasetsResource]
  }
}

