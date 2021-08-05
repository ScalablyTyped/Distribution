package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectsDisableXpnResourceRequest extends StObject {
  
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[SchemaXpnResourceId] = js.undefined
}
object SchemaProjectsDisableXpnResourceRequest {
  
  inline def apply(): SchemaProjectsDisableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsDisableXpnResourceRequest]
  }
  
  extension [Self <: SchemaProjectsDisableXpnResourceRequest](x: Self) {
    
    inline def setXpnResource(value: SchemaXpnResourceId): Self = StObject.set(x, "xpnResource", value.asInstanceOf[js.Any])
    
    inline def setXpnResourceUndefined: Self = StObject.set(x, "xpnResource", js.undefined)
  }
}
