package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquery.anon.DatasetId
import typings.gapiClientBigquery.anon.Oauthtoken
import typings.gapiClientBigquery.anon.PrettyPrint
import typings.gapiClientBigquery.anon.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesResource extends js.Object {
  /** Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted. */
  def delete(request: Oauthtoken): Request[Unit] = js.native
  /**
    * Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes
    * the structure of this table.
    */
  def get(request: PrettyPrint): Request[Table] = js.native
  /** Creates a new, empty table in the dataset. */
  def insert(request: DatasetId): Request[Table] = js.native
  /** Lists all tables in the specified dataset. Requires the READER dataset role. */
  def list(request: ProjectId): Request[TableList] = js.native
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource. This method supports patch semantics.
    */
  def patch(request: Oauthtoken): Request[Table] = js.native
  /**
    * Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are
    * provided in the submitted table resource.
    */
  def update(request: Oauthtoken): Request[Table] = js.native
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
  @scala.inline
  implicit class TablesResourceOps[Self <: TablesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Oauthtoken => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: PrettyPrint => Request[Table]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: DatasetId => Request[Table]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ProjectId => Request[TableList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Oauthtoken => Request[Table]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Oauthtoken => Request[Table]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

