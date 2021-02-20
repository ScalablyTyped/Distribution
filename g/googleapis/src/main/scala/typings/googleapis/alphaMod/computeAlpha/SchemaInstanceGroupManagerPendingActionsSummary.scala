package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagerPendingActionsSummary extends StObject {
  
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
  implicit class SchemaInstanceGroupManagerPendingActionsSummaryMutableBuilder[Self <: SchemaInstanceGroupManagerPendingActionsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreating(value: Double): Self = StObject.set(x, "creating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatingUndefined: Self = StObject.set(x, "creating", js.undefined)
    
    @scala.inline
    def setDeleting(value: Double): Self = StObject.set(x, "deleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletingUndefined: Self = StObject.set(x, "deleting", js.undefined)
    
    @scala.inline
    def setRecreating(value: Double): Self = StObject.set(x, "recreating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecreatingUndefined: Self = StObject.set(x, "recreating", js.undefined)
    
    @scala.inline
    def setRestarting(value: Double): Self = StObject.set(x, "restarting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartingUndefined: Self = StObject.set(x, "restarting", js.undefined)
  }
}
