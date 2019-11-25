package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityUserLink extends js.Object {
  var entity: js.UndefOr[EntityUserLinkEntity] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var permissions: js.UndefOr[EntityUserLinkPermissions] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var userRef: js.UndefOr[UserRef] = js.undefined
}

object EntityUserLink {
  @scala.inline
  def apply(
    entity: EntityUserLinkEntity = null,
    id: String = null,
    kind: String = null,
    permissions: EntityUserLinkPermissions = null,
    selfLink: String = null,
    userRef: UserRef = null
  ): EntityUserLink = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (userRef != null) __obj.updateDynamic("userRef")(userRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityUserLink]
  }
}

