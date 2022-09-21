package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicScaling extends StObject {
  
  /**
    * Duration of time after the last request that an instance must wait before the instance is shut down.
    */
  var idleTimeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum number of instances to create for this version.
    */
  var maxInstances: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBasicScaling {
  
  inline def apply(): SchemaBasicScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicScaling]
  }
  
  extension [Self <: SchemaBasicScaling](x: Self) {
    
    inline def setIdleTimeout(value: String): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutNull: Self = StObject.set(x, "idleTimeout", null)
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    inline def setMaxInstancesNull: Self = StObject.set(x, "maxInstances", null)
    
    inline def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
  }
}
