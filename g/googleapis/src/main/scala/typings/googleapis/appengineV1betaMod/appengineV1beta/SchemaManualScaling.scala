package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManualScaling extends StObject {
  
  /**
    * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
    */
  var instances: js.UndefOr[Double | Null] = js.undefined
}
object SchemaManualScaling {
  
  inline def apply(): SchemaManualScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManualScaling]
  }
  
  extension [Self <: SchemaManualScaling](x: Self) {
    
    inline def setInstances(value: Double): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
  }
}
