package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedExchangeInfo extends StObject {
  
  /**
    * Errors occurred while handling the signed exchagne.
    */
  var errors: js.UndefOr[js.Array[SignedExchangeError]] = js.native
  
  /**
    * Information about the signed exchange header.
    */
  var header: js.UndefOr[SignedExchangeHeader] = js.native
  
  /**
    * The outer response of signed HTTP exchange which was received from network.
    */
  var outerResponse: Response = js.native
  
  /**
    * Security details for the signed exchange header.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.native
}
object SignedExchangeInfo {
  
  @scala.inline
  def apply(outerResponse: Response): SignedExchangeInfo = {
    val __obj = js.Dynamic.literal(outerResponse = outerResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedExchangeInfo]
  }
  
  @scala.inline
  implicit class SignedExchangeInfoMutableBuilder[Self <: SignedExchangeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[SignedExchangeError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SignedExchangeError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: SignedExchangeHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setOuterResponse(value: Response): Self = StObject.set(x, "outerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDetails(value: SecurityDetails): Self = StObject.set(x, "securityDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDetailsUndefined: Self = StObject.set(x, "securityDetails", js.undefined)
  }
}
