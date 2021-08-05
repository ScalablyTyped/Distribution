package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure of the response from the FHIR server
  */
trait Response extends StObject {
  
  /**
    * Contains state information. Url, type, server configuration used, Id etc
    */
  var config: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Data returned from the FHIR server
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Error object returned by the client library.
    */
  var error: js.UndefOr[js.Any] = js.undefined
  
  /**
    * HTTP Response headers
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  
  /**
    * HTTP Status code string
    */
  var status: js.UndefOr[js.Any] = js.undefined
}
object Response {
  
  inline def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
