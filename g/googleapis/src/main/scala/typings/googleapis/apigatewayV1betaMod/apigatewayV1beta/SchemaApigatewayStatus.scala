package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayStatus extends StObject {
  
  /**
    * The status code, which should be an enum value of google.rpc.Code.
    */
  var code: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of messages that carry the error details. There is a common set of message types for APIs to use.
    */
  var details: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
  
  /**
    * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayStatus {
  
  inline def apply(): SchemaApigatewayStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayStatus]
  }
  
  extension [Self <: SchemaApigatewayStatus](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
