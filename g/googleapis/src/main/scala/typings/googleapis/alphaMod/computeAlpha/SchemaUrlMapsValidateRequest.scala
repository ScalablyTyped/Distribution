package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlMapsValidateRequest extends StObject {
  
  /**
    * Content of the UrlMap to be validated.
    */
  var resource: js.UndefOr[SchemaUrlMap] = js.undefined
}
object SchemaUrlMapsValidateRequest {
  
  inline def apply(): SchemaUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsValidateRequest]
  }
  
  extension [Self <: SchemaUrlMapsValidateRequest](x: Self) {
    
    inline def setResource(value: SchemaUrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
