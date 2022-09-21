package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserDefinedFunctionResource extends StObject {
  
  /**
    * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
    */
  var inlineCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserDefinedFunctionResource {
  
  inline def apply(): SchemaUserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDefinedFunctionResource]
  }
  
  extension [Self <: SchemaUserDefinedFunctionResource](x: Self) {
    
    inline def setInlineCode(value: String): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
    
    inline def setInlineCodeNull: Self = StObject.set(x, "inlineCode", null)
    
    inline def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
