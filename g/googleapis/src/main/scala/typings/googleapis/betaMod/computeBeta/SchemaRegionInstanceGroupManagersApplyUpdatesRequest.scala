package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InstanceGroupManagers.applyUpdatesToInstances
  */
@js.native
trait SchemaRegionInstanceGroupManagersApplyUpdatesRequest extends js.Object {
  
  /**
    * The list of instances for which we want to apply changes on this managed
    * instance group.
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The minimal action that should be perfomed on the instances. By default
    * NONE.
    */
  var minimalAction: js.UndefOr[String] = js.native
  
  /**
    * The most disruptive action that allowed to be performed on the instances.
    * By default REPLACE.
    */
  var mostDisruptiveAllowedAction: js.UndefOr[String] = js.native
}
object SchemaRegionInstanceGroupManagersApplyUpdatesRequest {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersApplyUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersApplyUpdatesRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersApplyUpdatesRequestOps[Self <: SchemaRegionInstanceGroupManagersApplyUpdatesRequest] (val x: Self) extends AnyVal {
    
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
    def setInstancesVarargs(value: String*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    
    @scala.inline
    def setMinimalAction(value: String): Self = this.set("minimalAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimalAction: Self = this.set("minimalAction", js.undefined)
    
    @scala.inline
    def setMostDisruptiveAllowedAction(value: String): Self = this.set("mostDisruptiveAllowedAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostDisruptiveAllowedAction: Self = this.set("mostDisruptiveAllowedAction", js.undefined)
  }
}
