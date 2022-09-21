package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEgressPolicy extends StObject {
  
  /**
    * Defines conditions on the source of a request causing this EgressPolicy to apply.
    */
  var egressFrom: js.UndefOr[SchemaEgressFrom] = js.undefined
  
  /**
    * Defines the conditions on the ApiOperation and destination resources that cause this EgressPolicy to apply.
    */
  var egressTo: js.UndefOr[SchemaEgressTo] = js.undefined
}
object SchemaEgressPolicy {
  
  inline def apply(): SchemaEgressPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEgressPolicy]
  }
  
  extension [Self <: SchemaEgressPolicy](x: Self) {
    
    inline def setEgressFrom(value: SchemaEgressFrom): Self = StObject.set(x, "egressFrom", value.asInstanceOf[js.Any])
    
    inline def setEgressFromUndefined: Self = StObject.set(x, "egressFrom", js.undefined)
    
    inline def setEgressTo(value: SchemaEgressTo): Self = StObject.set(x, "egressTo", value.asInstanceOf[js.Any])
    
    inline def setEgressToUndefined: Self = StObject.set(x, "egressTo", js.undefined)
  }
}
