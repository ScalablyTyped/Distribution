package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for `ListSkus`.
  */
trait SchemaListSkusResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListSkus` again with the `page_token` field set to this value. This
    * field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of public SKUs of the given service.
    */
  var skus: js.UndefOr[js.Array[SchemaSku]] = js.undefined
}
object SchemaListSkusResponse {
  
  inline def apply(): SchemaListSkusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSkusResponse]
  }
  
  extension [Self <: SchemaListSkusResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSkus(value: js.Array[SchemaSku]): Self = StObject.set(x, "skus", value.asInstanceOf[js.Any])
    
    inline def setSkusUndefined: Self = StObject.set(x, "skus", js.undefined)
    
    inline def setSkusVarargs(value: SchemaSku*): Self = StObject.set(x, "skus", js.Array(value :_*))
  }
}
