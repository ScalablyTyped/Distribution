package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Audience extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The access control list entry.
    */
  var item: js.UndefOr[Schema$PlusDomainsAclentryResource] = js.native
  /**
    * Identifies this resource as an audience. Value:
    * &quot;plus#audience&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of people in this circle. This only applies if entity_type is
    * CIRCLE.
    */
  var memberCount: js.UndefOr[Double] = js.native
  /**
    * The circle members&#39; visibility as chosen by the owner of the circle.
    * This only applies for items with &quot;item.type&quot; equals
    * &quot;circle&quot;. Possible values are:   - &quot;public&quot; - Members
    * are visible to the public.  - &quot;limited&quot; - Members are visible
    * to a limited audience.  - &quot;private&quot; - Members are visible to
    * the owner only.
    */
  var visibility: js.UndefOr[String] = js.native
}

object Schema$Audience {
  @scala.inline
  def apply(
    etag: String = null,
    item: Schema$PlusDomainsAclentryResource = null,
    kind: String = null,
    memberCount: Int | Double = null,
    visibility: String = null
  ): Schema$Audience = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (memberCount != null) __obj.updateDynamic("memberCount")(memberCount.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Audience]
  }
}

