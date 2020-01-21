package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersHasMember extends js.Object {
  var isMember: js.UndefOr[Boolean] = js.undefined
}

object MembersHasMember {
  @scala.inline
  def apply(isMember: js.UndefOr[Boolean] = js.undefined): MembersHasMember = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMember)) __obj.updateDynamic("isMember")(isMember.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersHasMember]
  }
}

