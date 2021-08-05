package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerPendingActionsSummary extends StObject {
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be created.
    */
  var creating: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be deleted.
    */
  var deleting: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be recreated.
    */
  var recreating: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are pending to be restarted.
    */
  var restarting: js.UndefOr[Double] = js.undefined
}
object SchemaInstanceGroupManagerPendingActionsSummary {
  
  inline def apply(): SchemaInstanceGroupManagerPendingActionsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerPendingActionsSummary]
  }
  
  extension [Self <: SchemaInstanceGroupManagerPendingActionsSummary](x: Self) {
    
    inline def setCreating(value: Double): Self = StObject.set(x, "creating", value.asInstanceOf[js.Any])
    
    inline def setCreatingUndefined: Self = StObject.set(x, "creating", js.undefined)
    
    inline def setDeleting(value: Double): Self = StObject.set(x, "deleting", value.asInstanceOf[js.Any])
    
    inline def setDeletingUndefined: Self = StObject.set(x, "deleting", js.undefined)
    
    inline def setRecreating(value: Double): Self = StObject.set(x, "recreating", value.asInstanceOf[js.Any])
    
    inline def setRecreatingUndefined: Self = StObject.set(x, "recreating", js.undefined)
    
    inline def setRestarting(value: Double): Self = StObject.set(x, "restarting", value.asInstanceOf[js.Any])
    
    inline def setRestartingUndefined: Self = StObject.set(x, "restarting", js.undefined)
  }
}
