package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerStatus extends StObject {
  
  /**
    * [Output only] Status of all-instances configuration on the group.
    */
  var allInstancesConfig: js.UndefOr[SchemaInstanceGroupManagerStatusAllInstancesConfig] = js.undefined
  
  /**
    * [Output Only] The URL of the Autoscaler that targets this instance group manager.
    */
  var autoscaler: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
    */
  var isStable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] Stateful status of the given Instance Group Manager.
    */
  var stateful: js.UndefOr[SchemaInstanceGroupManagerStatusStateful] = js.undefined
  
  /**
    * [Output Only] A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager.
    */
  var versionTarget: js.UndefOr[SchemaInstanceGroupManagerStatusVersionTarget] = js.undefined
}
object SchemaInstanceGroupManagerStatus {
  
  inline def apply(): SchemaInstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatus]
  }
  
  extension [Self <: SchemaInstanceGroupManagerStatus](x: Self) {
    
    inline def setAllInstancesConfig(value: SchemaInstanceGroupManagerStatusAllInstancesConfig): Self = StObject.set(x, "allInstancesConfig", value.asInstanceOf[js.Any])
    
    inline def setAllInstancesConfigUndefined: Self = StObject.set(x, "allInstancesConfig", js.undefined)
    
    inline def setAutoscaler(value: String): Self = StObject.set(x, "autoscaler", value.asInstanceOf[js.Any])
    
    inline def setAutoscalerNull: Self = StObject.set(x, "autoscaler", null)
    
    inline def setAutoscalerUndefined: Self = StObject.set(x, "autoscaler", js.undefined)
    
    inline def setIsStable(value: Boolean): Self = StObject.set(x, "isStable", value.asInstanceOf[js.Any])
    
    inline def setIsStableNull: Self = StObject.set(x, "isStable", null)
    
    inline def setIsStableUndefined: Self = StObject.set(x, "isStable", js.undefined)
    
    inline def setStateful(value: SchemaInstanceGroupManagerStatusStateful): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
    
    inline def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
    
    inline def setVersionTarget(value: SchemaInstanceGroupManagerStatusVersionTarget): Self = StObject.set(x, "versionTarget", value.asInstanceOf[js.Any])
    
    inline def setVersionTargetUndefined: Self = StObject.set(x, "versionTarget", js.undefined)
  }
}
