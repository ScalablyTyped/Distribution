package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerStatusStatefulPerInstanceConfigs extends StObject {
  
  /**
    * A bit indicating if all of the group's per-instance configurations (listed in the output of a listPerInstanceConfigs API call) have status EFFECTIVE or there are no per-instance-configs.
    */
  var allEffective: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInstanceGroupManagerStatusStatefulPerInstanceConfigs {
  
  inline def apply(): SchemaInstanceGroupManagerStatusStatefulPerInstanceConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatusStatefulPerInstanceConfigs]
  }
  
  extension [Self <: SchemaInstanceGroupManagerStatusStatefulPerInstanceConfigs](x: Self) {
    
    inline def setAllEffective(value: Boolean): Self = StObject.set(x, "allEffective", value.asInstanceOf[js.Any])
    
    inline def setAllEffectiveNull: Self = StObject.set(x, "allEffective", null)
    
    inline def setAllEffectiveUndefined: Self = StObject.set(x, "allEffective", js.undefined)
  }
}
