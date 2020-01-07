package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.googleapis.Anon_AccountRef
import typings.googleapis.Anon_EffectiveLocal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics Entity-User Link. Returns permissions that a
  * user has for an entity.
  */
@js.native
trait Schema$EntityUserLink extends js.Object {
  /**
    * Entity for this link. It can be an account, a web property, or a view
    * (profile).
    */
  var entity: js.UndefOr[Anon_AccountRef] = js.native
  /**
    * Entity user link ID
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for entity user link.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Permissions the user has for this entity.
    */
  var permissions: js.UndefOr[Anon_EffectiveLocal] = js.native
  /**
    * Self link for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * User reference.
    */
  var userRef: js.UndefOr[Schema$UserRef] = js.native
}

object Schema$EntityUserLink {
  @scala.inline
  def apply(
    entity: Anon_AccountRef = null,
    id: String = null,
    kind: String = null,
    permissions: Anon_EffectiveLocal = null,
    selfLink: String = null,
    userRef: Schema$UserRef = null
  ): Schema$EntityUserLink = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (userRef != null) __obj.updateDynamic("userRef")(userRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EntityUserLink]
  }
}

