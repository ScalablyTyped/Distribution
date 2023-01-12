package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedWebActivityIssueDetails extends StObject {
  
  var httpStatusCode: js.UndefOr[integer] = js.undefined
  
  /**
    * The package name of the Trusted Web Activity client app. This field is
    * only used when violation type is kDigitalAssetLinks.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The signature of the Trusted Web Activity client app. This field is only
    * used when violation type is kDigitalAssetLinks.
    */
  var signature: js.UndefOr[String] = js.undefined
  
  /**
    * The url that triggers the violation.
    */
  var url: String
  
  var violationType: TwaQualityEnforcementViolationType
}
object TrustedWebActivityIssueDetails {
  
  inline def apply(url: String, violationType: TwaQualityEnforcementViolationType): TrustedWebActivityIssueDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], violationType = violationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedWebActivityIssueDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustedWebActivityIssueDetails] (val x: Self) extends AnyVal {
    
    inline def setHttpStatusCode(value: integer): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setViolationType(value: TwaQualityEnforcementViolationType): Self = StObject.set(x, "violationType", value.asInstanceOf[js.Any])
  }
}
