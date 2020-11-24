package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagerPendingActionsSummary extends js.Object {
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be created.
    */
  var creating: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be deleted.
    */
  var deleting: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be recreated.
    */
  var recreating: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be restarted.
    */
  var restarting: js.UndefOr[Double] = js.native
}
object SchemaInstanceGroupManagerPendingActionsSummary {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagerPendingActionsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerPendingActionsSummary]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagerPendingActionsSummaryOps[Self <: SchemaInstanceGroupManagerPendingActionsSummary] (val x: Self) extends AnyVal {
    
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
    def setCreating(value: Double): Self = this.set("creating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreating: Self = this.set("creating", js.undefined)
    
    @scala.inline
    def setDeleting(value: Double): Self = this.set("deleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleting: Self = this.set("deleting", js.undefined)
    
    @scala.inline
    def setRecreating(value: Double): Self = this.set("recreating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecreating: Self = this.set("recreating", js.undefined)
    
    @scala.inline
    def setRestarting(value: Double): Self = this.set("restarting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestarting: Self = this.set("restarting", js.undefined)
  }
}
