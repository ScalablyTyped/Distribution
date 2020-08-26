package typings.gandiLivedns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * Can be used as a date with "new Date(change_time);"
    */
  var change_time: String = js.native
  var serial: Double = js.native
  var zone_data: js.Array[ZoneRecord] = js.native
  var zone_uuid: String = js.native
}

object Snapshot {
  @scala.inline
  def apply(change_time: String, serial: Double, zone_data: js.Array[ZoneRecord], zone_uuid: String): Snapshot = {
    val __obj = js.Dynamic.literal(change_time = change_time.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], zone_data = zone_data.asInstanceOf[js.Any], zone_uuid = zone_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChange_time(value: String): Self = this.set("change_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: Double): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def setZone_dataVarargs(value: ZoneRecord*): Self = this.set("zone_data", js.Array(value :_*))
    @scala.inline
    def setZone_data(value: js.Array[ZoneRecord]): Self = this.set("zone_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setZone_uuid(value: String): Self = this.set("zone_uuid", value.asInstanceOf[js.Any])
  }
  
}

