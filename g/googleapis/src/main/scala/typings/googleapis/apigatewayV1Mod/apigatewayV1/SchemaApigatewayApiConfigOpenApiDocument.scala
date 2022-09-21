package typings.googleapis.apigatewayV1Mod.apigatewayV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayApiConfigOpenApiDocument extends StObject {
  
  /**
    * The OpenAPI Specification document file.
    */
  var document: js.UndefOr[SchemaApigatewayApiConfigFile] = js.undefined
}
object SchemaApigatewayApiConfigOpenApiDocument {
  
  inline def apply(): SchemaApigatewayApiConfigOpenApiDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayApiConfigOpenApiDocument]
  }
  
  extension [Self <: SchemaApigatewayApiConfigOpenApiDocument](x: Self) {
    
    inline def setDocument(value: SchemaApigatewayApiConfigFile): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
