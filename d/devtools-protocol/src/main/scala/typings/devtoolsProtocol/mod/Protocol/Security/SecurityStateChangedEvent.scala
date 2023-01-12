package typings.devtoolsProtocol.mod.Protocol.Security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityStateChangedEvent extends StObject {
  
  /**
    * Previously a list of explanations for the security state. Now always
    * empty.
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
    * Overrides user-visible description of the state. Always omitted.
    */
  var summary: js.UndefOr[String] = js.undefined
}
object SecurityStateChangedEvent {
  
  inline def apply(
    explanations: js.Array[SecurityStateExplanation],
    insecureContentStatus: InsecureContentStatus,
    schemeIsCryptographic: Boolean,
    securityState: SecurityState
  ): SecurityStateChangedEvent = {
    val __obj = js.Dynamic.literal(explanations = explanations.asInstanceOf[js.Any], insecureContentStatus = insecureContentStatus.asInstanceOf[js.Any], schemeIsCryptographic = schemeIsCryptographic.asInstanceOf[js.Any], securityState = securityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityStateChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityStateChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setExplanations(value: js.Array[SecurityStateExplanation]): Self = StObject.set(x, "explanations", value.asInstanceOf[js.Any])
    
    inline def setExplanationsVarargs(value: SecurityStateExplanation*): Self = StObject.set(x, "explanations", js.Array(value*))
    
    inline def setInsecureContentStatus(value: InsecureContentStatus): Self = StObject.set(x, "insecureContentStatus", value.asInstanceOf[js.Any])
    
    inline def setSchemeIsCryptographic(value: Boolean): Self = StObject.set(x, "schemeIsCryptographic", value.asInstanceOf[js.Any])
    
    inline def setSecurityState(value: SecurityState): Self = StObject.set(x, "securityState", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
