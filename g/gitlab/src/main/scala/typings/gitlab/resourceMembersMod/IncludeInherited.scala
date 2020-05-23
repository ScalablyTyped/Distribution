package typings.gitlab.resourceMembersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeInherited extends js.Object {
  var includeInherited: js.UndefOr[Boolean] = js.undefined
}

object IncludeInherited {
  @scala.inline
  def apply(includeInherited: js.UndefOr[Boolean] = js.undefined): IncludeInherited = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeInherited)) __obj.updateDynamic("includeInherited")(includeInherited.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeInherited]
  }
}

