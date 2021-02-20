package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAutoAttachRequest extends StObject {
  
  /**
    * Whether to auto-attach to related targets.
    */
  var autoAttach: Boolean = js.native
  
  /**
    * Enables "flat" access to the session via specifying sessionId attribute in the commands.
    * We plan to make this the default, deprecate non-flattened mode,
    * and eventually retire it. See crbug.com/991325.
    */
  var flatten: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to pause new targets when attaching to them. Use `Runtime.runIfWaitingForDebugger`
    * to run paused targets.
    */
  var waitForDebuggerOnStart: Boolean = js.native
}
object SetAutoAttachRequest {
  
  @scala.inline
  def apply(autoAttach: Boolean, waitForDebuggerOnStart: Boolean): SetAutoAttachRequest = {
    val __obj = js.Dynamic.literal(autoAttach = autoAttach.asInstanceOf[js.Any], waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAutoAttachRequest]
  }
  
  @scala.inline
  implicit class SetAutoAttachRequestMutableBuilder[Self <: SetAutoAttachRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAttach(value: Boolean): Self = StObject.set(x, "autoAttach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
    
    @scala.inline
    def setWaitForDebuggerOnStart(value: Boolean): Self = StObject.set(x, "waitForDebuggerOnStart", value.asInstanceOf[js.Any])
  }
}
