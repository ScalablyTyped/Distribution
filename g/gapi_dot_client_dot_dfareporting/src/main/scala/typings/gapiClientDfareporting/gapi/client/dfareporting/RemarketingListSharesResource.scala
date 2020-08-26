package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.RemarketingListId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: RemarketingListId): Request[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: RemarketingListId): Request[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. */
  def update(request: Key): Request[RemarketingListShare] = js.native
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: RemarketingListId => Request[RemarketingListShare],
    patch: RemarketingListId => Request[RemarketingListShare],
    update: Key => Request[RemarketingListShare]
  ): RemarketingListSharesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingListSharesResource]
  }
  @scala.inline
  implicit class RemarketingListSharesResourceOps[Self <: RemarketingListSharesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: RemarketingListId => Request[RemarketingListShare]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: RemarketingListId => Request[RemarketingListShare]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[RemarketingListShare]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

