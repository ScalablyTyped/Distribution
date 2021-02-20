package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBlackboxPatternsRequest extends StObject {
  
  /**
    * Array of regexps that will be used to check script url for blackbox state.
    */
  var patterns: js.Array[String] = js.native
}
object SetBlackboxPatternsRequest {
  
  @scala.inline
  def apply(patterns: js.Array[String]): SetBlackboxPatternsRequest = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlackboxPatternsRequest]
  }
  
  @scala.inline
  implicit class SetBlackboxPatternsRequestMutableBuilder[Self <: SetBlackboxPatternsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
  }
}
