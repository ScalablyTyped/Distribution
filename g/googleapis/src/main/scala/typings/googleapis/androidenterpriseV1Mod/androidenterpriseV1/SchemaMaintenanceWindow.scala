package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Maintenance window for managed Google Play Accounts. This allows Play store
  * to update the apps on the foreground in the designated window.
  */
@js.native
trait SchemaMaintenanceWindow extends js.Object {
  
  /**
    * Duration of the maintenance window, in milliseconds. The duration must be
    * between 30 minutes and 24 hours (inclusive).
    */
  var durationMs: js.UndefOr[String] = js.native
  
  /**
    * Start time of the maintenance window, in milliseconds after midnight on
    * the device. Windows can span midnight.
    */
  var startTimeAfterMidnightMs: js.UndefOr[String] = js.native
}
object SchemaMaintenanceWindow {
  
  @scala.inline
  def apply(): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
  
  @scala.inline
  implicit class SchemaMaintenanceWindowOps[Self <: SchemaMaintenanceWindow] (val x: Self) extends AnyVal {
    
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
    def setDurationMs(value: String): Self = this.set("durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMs: Self = this.set("durationMs", js.undefined)
    
    @scala.inline
    def setStartTimeAfterMidnightMs(value: String): Self = this.set("startTimeAfterMidnightMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeAfterMidnightMs: Self = this.set("startTimeAfterMidnightMs", js.undefined)
  }
}
