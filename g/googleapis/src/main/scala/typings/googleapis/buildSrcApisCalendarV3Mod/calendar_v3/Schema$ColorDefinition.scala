package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ColorDefinition extends js.Object {
  /**
    * The background color associated with this color definition.
    */
  var background: js.UndefOr[String] = js.native
  /**
    * The foreground color that can be used to write on top of a background
    * with &#39;background&#39; color.
    */
  var foreground: js.UndefOr[String] = js.native
}

object Schema$ColorDefinition {
  @scala.inline
  def apply(background: String = null, foreground: String = null): Schema$ColorDefinition = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (foreground != null) __obj.updateDynamic("foreground")(foreground.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ColorDefinition]
  }
}

