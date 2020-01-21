package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeUrl extends js.Object {
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonTypeUrl {
  @scala.inline
  def apply(`type`: String = null, url: String = null): AnonTypeUrl = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeUrl]
  }
}

