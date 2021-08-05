package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetPoolsRemoveInstanceRequest extends StObject {
  
  /**
    * URLs of the instances to be removed from target pool.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.undefined
}
object SchemaTargetPoolsRemoveInstanceRequest {
  
  inline def apply(): SchemaTargetPoolsRemoveInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsRemoveInstanceRequest]
  }
  
  extension [Self <: SchemaTargetPoolsRemoveInstanceRequest](x: Self) {
    
    inline def setInstances(value: js.Array[SchemaInstanceReference]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaInstanceReference*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
