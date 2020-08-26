package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquery.anon.All
import typings.gapiClientBigquery.anon.Alt
import typings.gapiClientBigquery.anon.DatasetId
import typings.gapiClientBigquery.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsResource extends js.Object {
  /**
    * Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying
    * deleteContents. Immediately after deletion, you can create another dataset with the same name.
    */
  def delete(request: Alt): Request[Unit] = js.native
  /** Returns the dataset specified by datasetID. */
  def get(request: DatasetId): Request[Dataset] = js.native
  /** Creates a new empty dataset. */
  def insert(request: Fields): Request[Dataset] = js.native
  /** Lists all datasets in the specified project to which you have been granted the READER dataset role. */
  def list(request: All): Request[DatasetList] = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource. This method supports patch semantics.
    */
  def patch(request: DatasetId): Request[Dataset] = js.native
  /**
    * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that
    * are provided in the submitted dataset resource.
    */
  def update(request: DatasetId): Request[Dataset] = js.native
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
  @scala.inline
  implicit class DatasetsResourceOps[Self <: DatasetsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: DatasetId => Request[Dataset]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Dataset]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: All => Request[DatasetList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: DatasetId => Request[Dataset]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: DatasetId => Request[Dataset]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

