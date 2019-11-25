package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadgeUrl extends js.Object {
  var badgeUrl: js.UndefOr[String] = js.undefined
  var categoryId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Anon_BadgeUrl {
  @scala.inline
  def apply(badgeUrl: String = null, categoryId: String = null, name: String = null): Anon_BadgeUrl = {
    val __obj = js.Dynamic.literal()
    if (badgeUrl != null) __obj.updateDynamic("badgeUrl")(badgeUrl.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BadgeUrl]
  }
}

