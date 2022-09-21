package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1EgressPolicy extends StObject {
  
  /**
    * Defines conditions on the source of a request causing this EgressPolicy to apply.
    */
  var egressFrom: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1EgressFrom] = js.undefined
  
  /**
    * Defines the conditions on the ApiOperation and destination resources that cause this EgressPolicy to apply.
    */
  var egressTo: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1EgressTo] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1EgressPolicy {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1EgressPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1EgressPolicy]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1EgressPolicy](x: Self) {
    
    inline def setEgressFrom(value: SchemaGoogleIdentityAccesscontextmanagerV1EgressFrom): Self = StObject.set(x, "egressFrom", value.asInstanceOf[js.Any])
    
    inline def setEgressFromUndefined: Self = StObject.set(x, "egressFrom", js.undefined)
    
    inline def setEgressTo(value: SchemaGoogleIdentityAccesscontextmanagerV1EgressTo): Self = StObject.set(x, "egressTo", value.asInstanceOf[js.Any])
    
    inline def setEgressToUndefined: Self = StObject.set(x, "egressTo", js.undefined)
  }
}
