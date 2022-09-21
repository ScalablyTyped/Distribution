package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoteFunctionOptions extends StObject {
  
  /**
    * Fully qualified name of the user-provided connection object which holds the authentication information to send requests to the remote service. Format: ```"projects/{projectId\}/locations/{locationId\}/connections/{connectionId\}"```
    */
  var connection: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Endpoint of the user-provided remote service, e.g. ```https://us-east1-my_gcf_project.cloudfunctions.net/remote_add```
    */
  var endpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max number of rows in each batch sent to the remote service. If absent or if 0, BigQuery dynamically decides the number of rows in a batch.
    */
  var maxBatchingRows: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-defined context as a set of key/value pairs, which will be sent as function invocation context together with batched arguments in the requests to the remote service. The total number of bytes of keys and values must be less than 8KB.
    */
  var userDefinedContext: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaRemoteFunctionOptions {
  
  inline def apply(): SchemaRemoteFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoteFunctionOptions]
  }
  
  extension [Self <: SchemaRemoteFunctionOptions](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setMaxBatchingRows(value: String): Self = StObject.set(x, "maxBatchingRows", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchingRowsNull: Self = StObject.set(x, "maxBatchingRows", null)
    
    inline def setMaxBatchingRowsUndefined: Self = StObject.set(x, "maxBatchingRows", js.undefined)
    
    inline def setUserDefinedContext(value: StringDictionary[String]): Self = StObject.set(x, "userDefinedContext", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedContextNull: Self = StObject.set(x, "userDefinedContext", null)
    
    inline def setUserDefinedContextUndefined: Self = StObject.set(x, "userDefinedContext", js.undefined)
  }
}
