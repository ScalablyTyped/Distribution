package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBadgeUrl extends js.Object {
  var badgeUrl: js.UndefOr[String] = js.native
  var categoryId: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object AnonBadgeUrl {
  @scala.inline
  def apply(badgeUrl: String = null, categoryId: String = null, name: String = null): AnonBadgeUrl = {
    val __obj = js.Dynamic.literal()
    if (badgeUrl != null) __obj.updateDynamic("badgeUrl")(badgeUrl.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadgeUrl]
  }
}

