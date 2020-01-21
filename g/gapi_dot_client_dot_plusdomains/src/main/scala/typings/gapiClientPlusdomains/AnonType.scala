package typings.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  /** Media type of the link. */
  var `type`: js.UndefOr[String] = js.undefined
  /** URL of the link. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(`type`: String = null, url: String = null): AnonType = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

