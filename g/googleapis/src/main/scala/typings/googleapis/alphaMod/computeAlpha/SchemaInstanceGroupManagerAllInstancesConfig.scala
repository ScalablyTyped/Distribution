package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerAllInstancesConfig extends StObject {
  
  /**
    * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
    */
  var properties: js.UndefOr[SchemaInstancePropertiesPatch] = js.undefined
}
object SchemaInstanceGroupManagerAllInstancesConfig {
  
  inline def apply(): SchemaInstanceGroupManagerAllInstancesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerAllInstancesConfig]
  }
  
  extension [Self <: SchemaInstanceGroupManagerAllInstancesConfig](x: Self) {
    
    inline def setProperties(value: SchemaInstancePropertiesPatch): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
