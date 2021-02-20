package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagerActionsSummary extends StObject {
  
  /**
    * [Output Only] The total number of instances in the managed instance group
    * that are scheduled to be abandoned. Abandoning an instance removes it
    * from the managed instance group without deleting it.
    */
  var abandoning: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are scheduled to be created or are currently being created. If the group
    * fails to create any of these instances, it tries again until it creates
    * the instance successfully.  If you have disabled creation retries, this
    * field will not be populated; instead, the creatingWithoutRetries field
    * will be populated.
    */
  var creating: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances that the managed instance group
    * will attempt to create. The group attempts to create each instance only
    * once. If the group fails to create any of these instances, it decreases
    * the group&#39;s targetSize value accordingly.
    */
  var creatingWithoutRetries: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are scheduled to be deleted or are currently being deleted.
    */
  var deleting: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are running and have no scheduled actions.
    */
  var none: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are scheduled to be recreated or are currently being being recreated.
    * Recreating an instance deletes the existing root persistent disk and
    * creates a new disk from the image that is defined in the instance
    * template.
    */
  var recreating: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are being reconfigured with properties that do not require a restart or a
    * recreate action. For example, setting or removing target pools for the
    * instance.
    */
  var refreshing: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are scheduled to be restarted or are currently being restarted.
    */
  var restarting: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are being verified. See the managedInstances[].currentAction property in
    * the listManagedInstances method documentation.
    */
  var verifying: js.UndefOr[Double] = js.native
}
object SchemaInstanceGroupManagerActionsSummary {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagerActionsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerActionsSummary]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagerActionsSummaryMutableBuilder[Self <: SchemaInstanceGroupManagerActionsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbandoning(value: Double): Self = StObject.set(x, "abandoning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbandoningUndefined: Self = StObject.set(x, "abandoning", js.undefined)
    
    @scala.inline
    def setCreating(value: Double): Self = StObject.set(x, "creating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatingUndefined: Self = StObject.set(x, "creating", js.undefined)
    
    @scala.inline
    def setCreatingWithoutRetries(value: Double): Self = StObject.set(x, "creatingWithoutRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatingWithoutRetriesUndefined: Self = StObject.set(x, "creatingWithoutRetries", js.undefined)
    
    @scala.inline
    def setDeleting(value: Double): Self = StObject.set(x, "deleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletingUndefined: Self = StObject.set(x, "deleting", js.undefined)
    
    @scala.inline
    def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    @scala.inline
    def setRecreating(value: Double): Self = StObject.set(x, "recreating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecreatingUndefined: Self = StObject.set(x, "recreating", js.undefined)
    
    @scala.inline
    def setRefreshing(value: Double): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    @scala.inline
    def setRestarting(value: Double): Self = StObject.set(x, "restarting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartingUndefined: Self = StObject.set(x, "restarting", js.undefined)
    
    @scala.inline
    def setVerifying(value: Double): Self = StObject.set(x, "verifying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyingUndefined: Self = StObject.set(x, "verifying", js.undefined)
  }
}
