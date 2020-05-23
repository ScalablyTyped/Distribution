package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeUrl extends js.Object {
  var badgeUrl: js.UndefOr[String] = js.undefined
  var categoryId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object BadgeUrl {
  @scala.inline
  def apply(badgeUrl: String = null, categoryId: String = null, name: String = null): BadgeUrl = {
    val __obj = js.Dynamic.literal()
    if (badgeUrl != null) __obj.updateDynamic("badgeUrl")(badgeUrl.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeUrl]
  }
}

