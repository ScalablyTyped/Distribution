package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Maintenance window for managed Google Play Accounts. This allows Play store
  * to update the apps on the foreground in the designated window.
  */
@js.native
trait SchemaMaintenanceWindow extends StObject {
  
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
  implicit class SchemaMaintenanceWindowMutableBuilder[Self <: SchemaMaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    @scala.inline
    def setStartTimeAfterMidnightMs(value: String): Self = StObject.set(x, "startTimeAfterMidnightMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeAfterMidnightMsUndefined: Self = StObject.set(x, "startTimeAfterMidnightMs", js.undefined)
  }
}
