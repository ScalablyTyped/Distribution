package typings.gapiClientPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audience extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The access control list entry. */
  var item: js.UndefOr[PlusDomainsAclentryResource] = js.native
  /** Identifies this resource as an audience. Value: "plus#audience". */
  var kind: js.UndefOr[String] = js.native
  /** The number of people in this circle. This only applies if entity_type is CIRCLE. */
  var memberCount: js.UndefOr[Double] = js.native
  /**
    * The circle members' visibility as chosen by the owner of the circle. This only applies for items with "item.type" equals "circle". Possible values are:
    *
    * - "public" - Members are visible to the public.
    * - "limited" - Members are visible to a limited audience.
    * - "private" - Members are visible to the owner only.
    */
  var visibility: js.UndefOr[String] = js.native
}

object Audience {
  @scala.inline
  def apply(): Audience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audience]
  }
  @scala.inline
  implicit class AudienceOps[Self <: Audience] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItem(value: PlusDomainsAclentryResource): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMemberCount(value: Double): Self = this.set("memberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberCount: Self = this.set("memberCount", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

