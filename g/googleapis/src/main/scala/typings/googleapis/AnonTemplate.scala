package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTemplate extends js.Object {
  var template: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonTemplate {
  @scala.inline
  def apply(template: String = null, `type`: String = null): AnonTemplate = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTemplate]
  }
}

