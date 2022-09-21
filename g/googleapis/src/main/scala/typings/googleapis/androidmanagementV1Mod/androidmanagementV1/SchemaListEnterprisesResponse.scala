package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListEnterprisesResponse extends StObject {
  
  /**
    * The list of enterprises.
    */
  var enterprises: js.UndefOr[js.Array[SchemaEnterprise]] = js.undefined
  
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListEnterprisesResponse {
  
  inline def apply(): SchemaListEnterprisesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnterprisesResponse]
  }
  
  extension [Self <: SchemaListEnterprisesResponse](x: Self) {
    
    inline def setEnterprises(value: js.Array[SchemaEnterprise]): Self = StObject.set(x, "enterprises", value.asInstanceOf[js.Any])
    
    inline def setEnterprisesUndefined: Self = StObject.set(x, "enterprises", js.undefined)
    
    inline def setEnterprisesVarargs(value: SchemaEnterprise*): Self = StObject.set(x, "enterprises", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
