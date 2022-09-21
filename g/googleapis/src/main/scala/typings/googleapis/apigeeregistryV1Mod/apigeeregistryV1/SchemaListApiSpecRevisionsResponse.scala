package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListApiSpecRevisionsResponse extends StObject {
  
  /**
    * The revisions of the spec.
    */
  var apiSpecs: js.UndefOr[js.Array[SchemaApiSpec]] = js.undefined
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListApiSpecRevisionsResponse {
  
  inline def apply(): SchemaListApiSpecRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListApiSpecRevisionsResponse]
  }
  
  extension [Self <: SchemaListApiSpecRevisionsResponse](x: Self) {
    
    inline def setApiSpecs(value: js.Array[SchemaApiSpec]): Self = StObject.set(x, "apiSpecs", value.asInstanceOf[js.Any])
    
    inline def setApiSpecsUndefined: Self = StObject.set(x, "apiSpecs", js.undefined)
    
    inline def setApiSpecsVarargs(value: SchemaApiSpec*): Self = StObject.set(x, "apiSpecs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
