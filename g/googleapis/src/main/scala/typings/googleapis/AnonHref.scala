package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHref extends js.Object {
  var href: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
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

