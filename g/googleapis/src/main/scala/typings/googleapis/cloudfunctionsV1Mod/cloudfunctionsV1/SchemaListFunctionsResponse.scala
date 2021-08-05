package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListFunctions` method.
  */
trait SchemaListFunctionsResponse extends StObject {
  
  /**
    * The functions that match the request.
    */
  var functions: js.UndefOr[js.Array[SchemaCloudFunction]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more functions that match the
    * request; this value should be passed in a new
    * google.cloud.functions.v1.ListFunctionsRequest to get more functions.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListFunctionsResponse {
  
  inline def apply(): SchemaListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFunctionsResponse]
  }
  
  extension [Self <: SchemaListFunctionsResponse](x: Self) {
    
    inline def setFunctions(value: js.Array[SchemaCloudFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setFunctionsVarargs(value: SchemaCloudFunction*): Self = StObject.set(x, "functions", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
