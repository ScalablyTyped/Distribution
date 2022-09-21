package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayOperationMetadataDiagnostic extends StObject {
  
  /**
    * Location of the diagnostic.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The diagnostic message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayOperationMetadataDiagnostic {
  
  inline def apply(): SchemaApigatewayOperationMetadataDiagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayOperationMetadataDiagnostic]
  }
  
  extension [Self <: SchemaApigatewayOperationMetadataDiagnostic](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
