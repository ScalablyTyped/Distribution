package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.QuotaUser
import typings.gapiClientAnalytics.anon.RemarketingAudienceId
import typings.gapiClientAnalytics.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: RemarketingAudienceId): Request[Unit] = js.native
  /** Gets a remarketing audience to which the user has access. */
  def get(request: RemarketingAudienceId): Request[RemarketingAudience] = js.native
  /** Creates a new remarketing audience. */
  def insert(request: QuotaUser): Request[RemarketingAudience] = js.native
  /** Lists remarketing audiences to which the user has access. */
  def list(request: Type): Request[RemarketingAudiences] = js.native
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: RemarketingAudienceId): Request[RemarketingAudience] = js.native
  /** Updates an existing remarketing audience. */
  def update(request: RemarketingAudienceId): Request[RemarketingAudience] = js.native
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: RemarketingAudienceId => Request[Unit],
    get: RemarketingAudienceId => Request[RemarketingAudience],
    insert: QuotaUser => Request[RemarketingAudience],
    list: Type => Request[RemarketingAudiences],
    patch: RemarketingAudienceId => Request[RemarketingAudience],
    update: RemarketingAudienceId => Request[RemarketingAudience]
  ): RemarketingAudienceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RemarketingAudienceResource]
  }
  @scala.inline
  implicit class RemarketingAudienceResourceOps[Self <: RemarketingAudienceResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: RemarketingAudienceId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: RemarketingAudienceId => Request[RemarketingAudience]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[RemarketingAudience]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Type => Request[RemarketingAudiences]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: RemarketingAudienceId => Request[RemarketingAudience]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: RemarketingAudienceId => Request[RemarketingAudience]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

