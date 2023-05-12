package typings.devtoolsProtocol.mod.Protocol.Preload

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import typings.devtoolsProtocol.mod.Protocol.Network.RequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSet extends StObject {
  
  /**
    * A speculation rule set is either added through an inline
    * <script> tag or through an external resource via the
    * 'Speculation-Rules' HTTP header. For the first case, we include
    * the BackendNodeId of the relevant <script> tag. For the second
    * case, we include the external URL where the rule set was loaded
    * from, and also RequestId if Network domain is enabled.
    * 
    * See also:
    * - https://wicg.github.io/nav-speculation/speculation-rules.html#speculation-rules-script
    * - https://wicg.github.io/nav-speculation/speculation-rules.html#speculation-rules-header
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * TODO(https://crbug.com/1425354): Replace this property with structured error.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Error information
    * `errorMessage` is null iff `errorType` is null.
    */
  var errorType: js.UndefOr[RuleSetErrorType] = js.undefined
  
  var id: RuleSetId
  
  /**
    * Identifies a document which the rule set is associated with.
    */
  var loaderId: LoaderId
  
  var requestId: js.UndefOr[RequestId] = js.undefined
  
  /**
    * Source text of JSON representing the rule set. If it comes from
    * <script> tag, it is the textContent of the node. Note that it is
    * a JSON for valid case.
    * 
    * See also:
    * - https://wicg.github.io/nav-speculation/speculation-rules.html
    * - https://github.com/WICG/nav-speculation/blob/main/triggers.md
    */
  var sourceText: String
  
  var url: js.UndefOr[String] = js.undefined
}
object RuleSet {
  
  inline def apply(id: RuleSetId, loaderId: LoaderId, sourceText: String): RuleSet = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleSet] (val x: Self) extends AnyVal {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorType(value: RuleSetErrorType): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setId(value: RuleSetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLoaderId(value: LoaderId): Self = StObject.set(x, "loaderId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSourceText(value: String): Self = StObject.set(x, "sourceText", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
