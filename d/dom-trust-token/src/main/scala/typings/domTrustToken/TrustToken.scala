package typings.domTrustToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustToken extends StObject {
  
  var additionalSignedHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var additionalSigningData: js.UndefOr[String] = js.undefined
  
  var includeTimestampHeader: js.UndefOr[Boolean] = js.undefined
  
  var issuers: js.UndefOr[js.Array[String]] = js.undefined
  
  var refreshPolicy: js.UndefOr[RefreshPolicy] = js.undefined
  
  var signRequestData: js.UndefOr[SignRequestData] = js.undefined
  
  var `type`: OperationType
}
object TrustToken {
  
  inline def apply(`type`: OperationType): TrustToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustToken]
  }
  
  extension [Self <: TrustToken](x: Self) {
    
    inline def setAdditionalSignedHeaders(value: js.Array[String]): Self = StObject.set(x, "additionalSignedHeaders", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSignedHeadersUndefined: Self = StObject.set(x, "additionalSignedHeaders", js.undefined)
    
    inline def setAdditionalSignedHeadersVarargs(value: String*): Self = StObject.set(x, "additionalSignedHeaders", js.Array(value*))
    
    inline def setAdditionalSigningData(value: String): Self = StObject.set(x, "additionalSigningData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSigningDataUndefined: Self = StObject.set(x, "additionalSigningData", js.undefined)
    
    inline def setIncludeTimestampHeader(value: Boolean): Self = StObject.set(x, "includeTimestampHeader", value.asInstanceOf[js.Any])
    
    inline def setIncludeTimestampHeaderUndefined: Self = StObject.set(x, "includeTimestampHeader", js.undefined)
    
    inline def setIssuers(value: js.Array[String]): Self = StObject.set(x, "issuers", value.asInstanceOf[js.Any])
    
    inline def setIssuersUndefined: Self = StObject.set(x, "issuers", js.undefined)
    
    inline def setIssuersVarargs(value: String*): Self = StObject.set(x, "issuers", js.Array(value*))
    
    inline def setRefreshPolicy(value: RefreshPolicy): Self = StObject.set(x, "refreshPolicy", value.asInstanceOf[js.Any])
    
    inline def setRefreshPolicyUndefined: Self = StObject.set(x, "refreshPolicy", js.undefined)
    
    inline def setSignRequestData(value: SignRequestData): Self = StObject.set(x, "signRequestData", value.asInstanceOf[js.Any])
    
    inline def setSignRequestDataUndefined: Self = StObject.set(x, "signRequestData", js.undefined)
    
    inline def setType(value: OperationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
