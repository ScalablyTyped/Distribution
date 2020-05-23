package typings.gitlab.anon

import typings.gitlab.resourceAccessRequestsMod.AccessLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  accessLevel ? :gitlab.gitlab/dist/types/core/templates/ResourceAccessRequests.AccessLevel} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait accessLevelAccessLevelSud extends js.Object {
  var accessLevel: js.UndefOr[AccessLevel] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object accessLevelAccessLevelSud {
  @scala.inline
  def apply(accessLevel: AccessLevel = null, sudo: String | Double = null): accessLevelAccessLevelSud = {
    val __obj = js.Dynamic.literal()
    if (accessLevel != null) __obj.updateDynamic("accessLevel")(accessLevel.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[accessLevelAccessLevelSud]
  }
}

