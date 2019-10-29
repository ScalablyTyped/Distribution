package typings.gitlab

import typings.gitlab.distTypesCoreTemplatesResourceAccessRequestsMod.AccessLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessLevel extends js.Object {
  var accessLevel: js.UndefOr[AccessLevel] = js.undefined
}

object Anon_AccessLevel {
  @scala.inline
  def apply(accessLevel: AccessLevel = null): Anon_AccessLevel = {
    val __obj = js.Dynamic.literal()
    if (accessLevel != null) __obj.updateDynamic("accessLevel")(accessLevel)
    __obj.asInstanceOf[Anon_AccessLevel]
  }
}

