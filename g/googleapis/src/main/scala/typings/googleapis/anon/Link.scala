package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends js.Object {
  var description: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Link {
  @scala.inline
  def apply(description: String = null, link: String = null, `type`: String = null): Link = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

