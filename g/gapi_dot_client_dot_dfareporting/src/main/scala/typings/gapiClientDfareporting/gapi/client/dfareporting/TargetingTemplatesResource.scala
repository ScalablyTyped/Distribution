package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AdvertiserIdAlt
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetingTemplatesResource extends js.Object {
  /** Gets one targeting template by ID. */
  def get(request: Fields): Request[TargetingTemplate] = js.native
  /** Inserts a new targeting template. */
  def insert(request: Key): Request[TargetingTemplate] = js.native
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(request: AdvertiserIdAlt): Request[TargetingTemplatesListResponse] = js.native
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: Fields): Request[TargetingTemplate] = js.native
  /** Updates an existing targeting template. */
  def update(request: Key): Request[TargetingTemplate] = js.native
}

object TargetingTemplatesResource {
  @scala.inline
  def apply(
    get: Fields => Request[TargetingTemplate],
    insert: Key => Request[TargetingTemplate],
    list: AdvertiserIdAlt => Request[TargetingTemplatesListResponse],
    patch: Fields => Request[TargetingTemplate],
    update: Key => Request[TargetingTemplate]
  ): TargetingTemplatesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TargetingTemplatesResource]
  }
  @scala.inline
  implicit class TargetingTemplatesResourceOps[Self <: TargetingTemplatesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[TargetingTemplate]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[TargetingTemplate]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AdvertiserIdAlt => Request[TargetingTemplatesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[TargetingTemplate]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[TargetingTemplate]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

