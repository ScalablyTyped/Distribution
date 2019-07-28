package typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audience extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The access control list entry. */
  var item: js.UndefOr[PlusDomainsAclentryResource] = js.undefined
  /** Identifies this resource as an audience. Value: "plus#audience". */
  var kind: js.UndefOr[String] = js.undefined
  /** The number of people in this circle. This only applies if entity_type is CIRCLE. */
  var memberCount: js.UndefOr[Double] = js.undefined
  /**
    * The circle members' visibility as chosen by the owner of the circle. This only applies for items with "item.type" equals "circle". Possible values are:
    *
    * - "public" - Members are visible to the public.
    * - "limited" - Members are visible to a limited audience.
    * - "private" - Members are visible to the owner only.
    */
  var visibility: js.UndefOr[String] = js.undefined
}

object Audience {
  @scala.inline
  def apply(
    etag: String = null,
    item: PlusDomainsAclentryResource = null,
    kind: String = null,
    memberCount: Int | Double = null,
    visibility: String = null
  ): Audience = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (item != null) __obj.updateDynamic("item")(item)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (memberCount != null) __obj.updateDynamic("memberCount")(memberCount.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[Audience]
  }
}

