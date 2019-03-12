package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsResource extends js.Object {
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying
    * deleteContents. Immediately after deletion, you can create another dataset with the same name.
    */
  def delete(request: gapiDotClientDotBigqueryLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns the dataset specified by datasetID. */
  def get(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetId): gapiDotClientLib.gapiNs.clientNs.Request[Dataset]
  /** Creates a new empty dataset. */
  def insert(request: gapiDotClientDotBigqueryLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Dataset]
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(request: gapiDotClientDotBigqueryLib.Anon_All): gapiDotClientLib.gapiNs.clientNs.Request[DatasetList]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource. This method supports patch semantics.
    */
  def patch(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetId): gapiDotClientLib.gapiNs.clientNs.Request[Dataset]
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource.
    */
  def update(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetId): gapiDotClientLib.gapiNs.clientNs.Request[Dataset]
}

object DatasetsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotBigqueryLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotBigqueryLib.Anon_AltDatasetId => gapiDotClientLib.gapiNs.clientNs.Request[Dataset],
    insert: gapiDotClientDotBigqueryLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Dataset],
    list: gapiDotClientDotBigqueryLib.Anon_All => gapiDotClientLib.gapiNs.clientNs.Request[DatasetList],
    patch: gapiDotClientDotBigqueryLib.Anon_AltDatasetId => gapiDotClientLib.gapiNs.clientNs.Request[Dataset],
    update: gapiDotClientDotBigqueryLib.Anon_AltDatasetId => gapiDotClientLib.gapiNs.clientNs.Request[Dataset]
  ): DatasetsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatasetsResource]
  }
}

