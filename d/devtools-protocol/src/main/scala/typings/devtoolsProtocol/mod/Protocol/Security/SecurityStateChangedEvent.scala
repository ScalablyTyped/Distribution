package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityStateChangedEvent extends StObject {
  
  /**
    * List of explanations for the security state. If the overall security state is `insecure` or
    * `warning`, at least one corresponding explanation should be included.
    */
  var explanations: js.Array[SecurityStateExplanation]
  
  /**
    * Information about insecure content on the page.
    */
  var insecureContentStatus: InsecureContentStatus
  
  /**
    * True if the page was loaded over cryptographic transport such as HTTPS.
    */
  var schemeIsCryptographic: Boolean
  
  /**
    * Security state.
    */
  var securityState: SecurityState
  
  /**
    * Overrides user-visible description of the state.
    */
  var summary: js.UndefOr[String] = js.undefined
}
object SecurityStateChangedEvent {
  
  @scala.inline
  def apply(
    explanations: js.Array[SecurityStateExplanation],
    insecureContentStatus: InsecureContentStatus,
    schemeIsCryptographic: Boolean,
    securityState: SecurityState
  ): SecurityStateChangedEvent = {
    val __obj = js.Dynamic.literal(explanations = explanations.asInstanceOf[js.Any], insecureContentStatus = insecureContentStatus.asInstanceOf[js.Any], schemeIsCryptographic = schemeIsCryptographic.asInstanceOf[js.Any], securityState = securityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityStateChangedEvent]
  }
  
  @scala.inline
  implicit class SecurityStateChangedEventMutableBuilder[Self <: SecurityStateChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplanations(value: js.Array[SecurityStateExplanation]): Self = StObject.set(x, "explanations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplanationsVarargs(value: SecurityStateExplanation*): Self = StObject.set(x, "explanations", js.Array(value :_*))
    
    @scala.inline
    def setInsecureContentStatus(value: InsecureContentStatus): Self = StObject.set(x, "insecureContentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeIsCryptographic(value: Boolean): Self = StObject.set(x, "schemeIsCryptographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityState(value: SecurityState): Self = StObject.set(x, "securityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
