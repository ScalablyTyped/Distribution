package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityUserLink extends js.Object {
  var entity: js.UndefOr[EntityUserLinkEntity] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var permissions: js.UndefOr[EntityUserLinkPermissions] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var userRef: js.UndefOr[UserRef] = js.undefined
}

object EntityUserLink {
  @scala.inline
  def apply(
    entity: EntityUserLinkEntity = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    permissions: EntityUserLinkPermissions = null,
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

