package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityStateExplanation extends StObject {
  
  /**
    * Page certificate.
    */
  var certificate: js.Array[String]
  
  /**
    * Full text explanation of the factor.
    */
  var description: String
  
  /**
    * The type of mixed content described by the explanation.
    */
  var mixedContentType: MixedContentType
  
  /**
    * Recommendations to fix any issues.
    */
  var recommendations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Security state representing the severity of the factor being explained.
    */
  var securityState: SecurityState
  
  /**
    * Short phrase describing the type of factor.
    */
  var summary: String
  
  /**
    * Title describing the type of factor.
    */
  var title: String
}
object SecurityStateExplanation {
  
  @scala.inline
  def apply(
    certificate: js.Array[String],
    description: String,
    mixedContentType: MixedContentType,
    securityState: SecurityState,
    summary: String,
    title: String
  ): SecurityStateExplanation = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], mixedContentType = mixedContentType.asInstanceOf[js.Any], securityState = securityState.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityStateExplanation]
  }
  
  @scala.inline
  implicit class SecurityStateExplanationMutableBuilder[Self <: SecurityStateExplanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: js.Array[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateVarargs(value: String*): Self = StObject.set(x, "certificate", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedContentType(value: MixedContentType): Self = StObject.set(x, "mixedContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendations(value: js.Array[String]): Self = StObject.set(x, "recommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationsUndefined: Self = StObject.set(x, "recommendations", js.undefined)
    
    @scala.inline
    def setRecommendationsVarargs(value: String*): Self = StObject.set(x, "recommendations", js.Array(value :_*))
    
    @scala.inline
    def setSecurityState(value: SecurityState): Self = StObject.set(x, "securityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
