package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIngressPolicy extends StObject {
  
  /**
    * Defines the conditions on the source of a request causing this IngressPolicy to apply.
    */
  var ingressFrom: js.UndefOr[SchemaIngressFrom] = js.undefined
  
  /**
    * Defines the conditions on the ApiOperation and request destination that cause this IngressPolicy to apply.
    */
  var ingressTo: js.UndefOr[SchemaIngressTo] = js.undefined
}
object SchemaIngressPolicy {
  
  inline def apply(): SchemaIngressPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIngressPolicy]
  }
  
  extension [Self <: SchemaIngressPolicy](x: Self) {
    
    inline def setIngressFrom(value: SchemaIngressFrom): Self = StObject.set(x, "ingressFrom", value.asInstanceOf[js.Any])
    
    inline def setIngressFromUndefined: Self = StObject.set(x, "ingressFrom", js.undefined)
    
    inline def setIngressTo(value: SchemaIngressTo): Self = StObject.set(x, "ingressTo", value.asInstanceOf[js.Any])
    
    inline def setIngressToUndefined: Self = StObject.set(x, "ingressTo", js.undefined)
  }
}
