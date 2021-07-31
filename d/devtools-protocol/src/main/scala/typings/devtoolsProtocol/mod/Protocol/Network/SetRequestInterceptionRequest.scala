package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRequestInterceptionRequest extends StObject {
  
  /**
    * Requests matching any of these patterns will be forwarded and wait for the corresponding
    * continueInterceptedRequest call.
    */
  var patterns: js.Array[RequestPattern]
}
object SetRequestInterceptionRequest {
  
  @scala.inline
  def apply(patterns: js.Array[RequestPattern]): SetRequestInterceptionRequest = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRequestInterceptionRequest]
  }
  
  @scala.inline
  implicit class SetRequestInterceptionRequestMutableBuilder[Self <: SetRequestInterceptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatterns(value: js.Array[RequestPattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: RequestPattern*): Self = StObject.set(x, "patterns", js.Array(value :_*))
  }
}
