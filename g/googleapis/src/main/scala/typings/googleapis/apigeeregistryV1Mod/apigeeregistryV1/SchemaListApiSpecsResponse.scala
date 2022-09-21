package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListApiSpecsResponse extends StObject {
  
  /**
    * The specs from the specified publisher.
    */
  var apiSpecs: js.UndefOr[js.Array[SchemaApiSpec]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListApiSpecsResponse {
  
  inline def apply(): SchemaListApiSpecsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListApiSpecsResponse]
  }
  
  extension [Self <: SchemaListApiSpecsResponse](x: Self) {
    
    inline def setApiSpecs(value: js.Array[SchemaApiSpec]): Self = StObject.set(x, "apiSpecs", value.asInstanceOf[js.Any])
    
    inline def setApiSpecsUndefined: Self = StObject.set(x, "apiSpecs", js.undefined)
    
    inline def setApiSpecsVarargs(value: SchemaApiSpec*): Self = StObject.set(x, "apiSpecs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
