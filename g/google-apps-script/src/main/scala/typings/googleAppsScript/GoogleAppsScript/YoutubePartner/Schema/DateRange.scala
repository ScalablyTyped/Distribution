package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  var end: js.UndefOr[Date] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
}

object DateRange {
  @scala.inline
  def apply(end: Date = null, kind: String = null, start: Date = null): DateRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
}

