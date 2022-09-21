package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerStatusStateful extends StObject {
  
  /**
    * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful configuration even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
    */
  var hasStatefulConfig: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful configuration even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions. This field is deprecated in favor of has_stateful_config.
    */
  var isStateful: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output Only] Status of per-instance configurations on the instance.
    */
  var perInstanceConfigs: js.UndefOr[SchemaInstanceGroupManagerStatusStatefulPerInstanceConfigs] = js.undefined
}
object SchemaInstanceGroupManagerStatusStateful {
  
  inline def apply(): SchemaInstanceGroupManagerStatusStateful = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatusStateful]
  }
  
  extension [Self <: SchemaInstanceGroupManagerStatusStateful](x: Self) {
    
    inline def setHasStatefulConfig(value: Boolean): Self = StObject.set(x, "hasStatefulConfig", value.asInstanceOf[js.Any])
    
    inline def setHasStatefulConfigNull: Self = StObject.set(x, "hasStatefulConfig", null)
    
    inline def setHasStatefulConfigUndefined: Self = StObject.set(x, "hasStatefulConfig", js.undefined)
    
    inline def setIsStateful(value: Boolean): Self = StObject.set(x, "isStateful", value.asInstanceOf[js.Any])
    
    inline def setIsStatefulNull: Self = StObject.set(x, "isStateful", null)
    
    inline def setIsStatefulUndefined: Self = StObject.set(x, "isStateful", js.undefined)
    
    inline def setPerInstanceConfigs(value: SchemaInstanceGroupManagerStatusStatefulPerInstanceConfigs): Self = StObject.set(x, "perInstanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setPerInstanceConfigsUndefined: Self = StObject.set(x, "perInstanceConfigs", js.undefined)
  }
}
