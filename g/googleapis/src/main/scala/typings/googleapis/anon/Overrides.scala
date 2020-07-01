package typings.googleapis.anon

import typings.googleapis.calendarV3Mod.calendarV3.SchemaEventReminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overrides extends js.Object {
  var overrides: js.UndefOr[js.Array[SchemaEventReminder]] = js.native
  var useDefault: js.UndefOr[Boolean] = js.native
}

object Overrides {
  @scala.inline
  def apply(overrides: js.Array[SchemaEventReminder] = null, useDefault: js.UndefOr[Boolean] = js.undefined): Overrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(useDefault)) __obj.updateDynamic("useDefault")(useDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
}

