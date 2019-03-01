package typings
package gandiDashLivednsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  /**
    * Can be used as a date with "new Date(change_time);"
    */
  var change_time: java.lang.String
  var serial: scala.Double
  var zone_data: js.Array[ZoneRecord]
  var zone_uuid: java.lang.String
}

object Snapshot {
  @scala.inline
  def apply(
    change_time: java.lang.String,
    serial: scala.Double,
    zone_data: js.Array[ZoneRecord],
    zone_uuid: java.lang.String
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change_time")(change_time)
    __obj.updateDynamic("serial")(serial)
    __obj.updateDynamic("zone_data")(zone_data)
    __obj.updateDynamic("zone_uuid")(zone_uuid)
    __obj.asInstanceOf[Snapshot]
  }
}

