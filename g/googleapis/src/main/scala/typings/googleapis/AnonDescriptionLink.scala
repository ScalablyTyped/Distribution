package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescriptionLink extends js.Object {
  var description: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonDescriptionLink {
  @scala.inline
  def apply(description: String = null, link: String = null, `type`: String = null): AnonDescriptionLink = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionLink]
  }
}

