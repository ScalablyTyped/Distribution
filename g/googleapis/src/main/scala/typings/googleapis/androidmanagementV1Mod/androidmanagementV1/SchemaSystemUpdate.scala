package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for managing system updates
  */
@js.native
trait SchemaSystemUpdate extends js.Object {
  /**
    * If the type is WINDOWED, the end of the maintenance window, measured as
    * the number of minutes after midnight in device&#39;s local time. This
    * value must be between 0 and 1439, inclusive. If this value is less than
    * start_minutes, then the maintenance window spans midnight. If the
    * maintenance window specified is smaller than 30 minutes, the actual
    * window is extended to 30 minutes beyond the start time.
    */
  var endMinutes: js.UndefOr[Double] = js.native
  /**
    * If the type is WINDOWED, the start of the maintenance window, measured as
    * the number of minutes after midnight in the device&#39;s local time. This
    * value must be between 0 and 1439, inclusive.
    */
  var startMinutes: js.UndefOr[Double] = js.native
  /**
    * The type of system update to configure.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaSystemUpdate {
  @scala.inline
  def apply(): SchemaSystemUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemUpdate]
  }
  @scala.inline
  implicit class SchemaSystemUpdateOps[Self <: SchemaSystemUpdate] (val x: Self) extends AnyVal {
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
    def setEndMinutes(value: Double): Self = this.set("endMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndMinutes: Self = this.set("endMinutes", js.undefined)
    @scala.inline
    def setStartMinutes(value: Double): Self = this.set("startMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartMinutes: Self = this.set("startMinutes", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

