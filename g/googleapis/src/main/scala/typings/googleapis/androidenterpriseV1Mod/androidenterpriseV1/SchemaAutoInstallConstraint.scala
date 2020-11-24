package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The auto-install constraint. Defines a set of restrictions for
  * installation. At least one of the fields must be set.
  */
@js.native
trait SchemaAutoInstallConstraint extends js.Object {
  
  /**
    * Charging state constraint.
    */
  var chargingStateConstraint: js.UndefOr[String] = js.native
  
  /**
    * Device idle state constraint.
    */
  var deviceIdleStateConstraint: js.UndefOr[String] = js.native
  
  /**
    * Network type constraint.
    */
  var networkTypeConstraint: js.UndefOr[String] = js.native
}
object SchemaAutoInstallConstraint {
  
  @scala.inline
  def apply(): SchemaAutoInstallConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoInstallConstraint]
  }
  
  @scala.inline
  implicit class SchemaAutoInstallConstraintOps[Self <: SchemaAutoInstallConstraint] (val x: Self) extends AnyVal {
    
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
    def setChargingStateConstraint(value: String): Self = this.set("chargingStateConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargingStateConstraint: Self = this.set("chargingStateConstraint", js.undefined)
    
    @scala.inline
    def setDeviceIdleStateConstraint(value: String): Self = this.set("deviceIdleStateConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIdleStateConstraint: Self = this.set("deviceIdleStateConstraint", js.undefined)
    
    @scala.inline
    def setNetworkTypeConstraint(value: String): Self = this.set("networkTypeConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTypeConstraint: Self = this.set("networkTypeConstraint", js.undefined)
  }
}
