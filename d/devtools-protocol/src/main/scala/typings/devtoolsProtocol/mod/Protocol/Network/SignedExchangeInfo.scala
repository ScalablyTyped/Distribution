package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedExchangeInfo extends StObject {
  
  /**
    * Errors occurred while handling the signed exchagne.
    */
  var errors: js.UndefOr[js.Array[SignedExchangeError]] = js.undefined
  
  /**
    * Information about the signed exchange header.
    */
  var header: js.UndefOr[SignedExchangeHeader] = js.undefined
  
  /**
    * The outer response of signed HTTP exchange which was received from network.
    */
  var outerResponse: Response
  
  /**
    * Security details for the signed exchange header.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.undefined
}
object SignedExchangeInfo {
  
  inline def apply(outerResponse: Response): SignedExchangeInfo = {
    val __obj = js.Dynamic.literal(outerResponse = outerResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedExchangeInfo]
  }
  
  extension [Self <: SignedExchangeInfo](x: Self) {
    
    inline def setErrors(value: js.Array[SignedExchangeError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SignedExchangeError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setHeader(value: SignedExchangeHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setOuterResponse(value: Response): Self = StObject.set(x, "outerResponse", value.asInstanceOf[js.Any])
    
    inline def setSecurityDetails(value: SecurityDetails): Self = StObject.set(x, "securityDetails", value.asInstanceOf[js.Any])
    
    inline def setSecurityDetailsUndefined: Self = StObject.set(x, "securityDetails", js.undefined)
  }
}
