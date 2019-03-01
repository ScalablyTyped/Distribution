package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityUserLink extends js.Object {
  /** Entity for this link. It can be an account, a web property, or a view (profile). */
  var entity: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_AccountRef] = js.undefined
  /** Entity user link ID */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for entity user link. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Permissions the user has for this entity. */
  var permissions: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_EffectiveLocal] = js.undefined
  /** Self link for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** User reference. */
  var userRef: js.UndefOr[UserRef] = js.undefined
}

object EntityUserLink {
  @scala.inline
  def apply(
    entity: gapiDotClientDotAnalyticsLib.Anon_AccountRef = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    permissions: gapiDotClientDotAnalyticsLib.Anon_EffectiveLocal = null,
    selfLink: java.lang.String = null,
    userRef: UserRef = null
  ): EntityUserLink = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (userRef != null) __obj.updateDynamic("userRef")(userRef)
    __obj.asInstanceOf[EntityUserLink]
  }
}

