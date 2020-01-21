package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitTableTransitTimeRow extends js.Object {
  var values: js.UndefOr[js.Array[TransitTableTransitTimeRowTransitTimeValue]] = js.undefined
}

object TransitTableTransitTimeRow {
  @scala.inline
  def apply(values: js.Array[TransitTableTransitTimeRowTransitTimeValue] = null): TransitTableTransitTimeRow = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitTableTransitTimeRow]
  }
}

