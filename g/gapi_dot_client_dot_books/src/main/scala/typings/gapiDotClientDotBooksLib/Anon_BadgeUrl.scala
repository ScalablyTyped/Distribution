package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BadgeUrl extends js.Object {
  var badgeUrl: js.UndefOr[java.lang.String] = js.undefined
  var categoryId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BadgeUrl {
  @scala.inline
  def apply(
    badgeUrl: java.lang.String = null,
    categoryId: java.lang.String = null,
    name: java.lang.String = null
  ): Anon_BadgeUrl = {
    val __obj = js.Dynamic.literal()
    if (badgeUrl != null) __obj.updateDynamic("badgeUrl")(badgeUrl)
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_BadgeUrl]
  }
}

