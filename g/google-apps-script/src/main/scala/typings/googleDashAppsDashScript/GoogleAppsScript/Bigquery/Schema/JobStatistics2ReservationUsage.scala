package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics2ReservationUsage extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var slotMs: js.UndefOr[String] = js.undefined
}

object JobStatistics2ReservationUsage {
  @scala.inline
  def apply(name: String = null, slotMs: String = null): JobStatistics2ReservationUsage = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (slotMs != null) __obj.updateDynamic("slotMs")(slotMs)
    __obj.asInstanceOf[JobStatistics2ReservationUsage]
  }
}

