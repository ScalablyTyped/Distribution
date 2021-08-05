package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for political geography and representative information for an
  * address.
  */
trait SchemaRepresentativeInfoRequest extends StObject {
  
  var contextParams: js.UndefOr[SchemaContextParams] = js.undefined
}
object SchemaRepresentativeInfoRequest {
  
  inline def apply(): SchemaRepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepresentativeInfoRequest]
  }
  
  extension [Self <: SchemaRepresentativeInfoRequest](x: Self) {
    
    inline def setContextParams(value: SchemaContextParams): Self = StObject.set(x, "contextParams", value.asInstanceOf[js.Any])
    
    inline def setContextParamsUndefined: Self = StObject.set(x, "contextParams", js.undefined)
  }
}
