package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.CreativeFieldId
import typings.gapiClientDfareporting.anon.ProfileId
import typings.gapiClientDfareporting.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: CreativeFieldId): Request[Unit] = js.native
  /** Gets one creative field value by ID. */
  def get(request: CreativeFieldId): Request[CreativeFieldValue] = js.native
  /** Inserts a new creative field value. */
  def insert(request: ProfileId): Request[CreativeFieldValue] = js.native
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: QuotaUser): Request[CreativeFieldValuesListResponse] = js.native
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: CreativeFieldId): Request[CreativeFieldValue] = js.native
  /** Updates an existing creative field value. */
  def update(request: ProfileId): Request[CreativeFieldValue] = js.native
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: CreativeFieldId => Request[Unit],
    get: CreativeFieldId => Request[CreativeFieldValue],
    insert: ProfileId => Request[CreativeFieldValue],
    list: QuotaUser => Request[CreativeFieldValuesListResponse],
    patch: CreativeFieldId => Request[CreativeFieldValue],
    update: ProfileId => Request[CreativeFieldValue]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
  @scala.inline
  implicit class CreativeFieldValuesResourceOps[Self <: CreativeFieldValuesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: CreativeFieldId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: CreativeFieldId => Request[CreativeFieldValue]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ProfileId => Request[CreativeFieldValue]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: QuotaUser => Request[CreativeFieldValuesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: CreativeFieldId => Request[CreativeFieldValue]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ProfileId => Request[CreativeFieldValue]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

