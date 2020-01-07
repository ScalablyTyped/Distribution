package typings.googleapis

import typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Schema$EventReminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Overrides extends js.Object {
  var overrides: js.UndefOr[js.Array[Schema$EventReminder]] = js.native
  var useDefault: js.UndefOr[Boolean] = js.native
}

object Anon_Overrides {
  @scala.inline
  def apply(overrides: js.Array[Schema$EventReminder] = null, useDefault: js.UndefOr[Boolean] = js.undefined): Anon_Overrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefault)) __obj.updateDynamic("useDefault")(useDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Overrides]
  }
}

