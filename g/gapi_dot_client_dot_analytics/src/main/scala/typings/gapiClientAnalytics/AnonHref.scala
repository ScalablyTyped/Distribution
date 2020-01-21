package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  /** Link to the account for this web property. */
  var href: js.UndefOr[String] = js.undefined
  /** Type of the parent link. Its value is "analytics#account". */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonHref {
  @scala.inline
  def apply(href: String = null, `type`: String = null): AnonHref = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHref]
  }
}

