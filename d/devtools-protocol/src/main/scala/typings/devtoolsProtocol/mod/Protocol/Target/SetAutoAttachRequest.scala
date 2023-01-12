package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAutoAttachRequest extends StObject {
  
  /**
    * Whether to auto-attach to related targets.
    */
  var autoAttach: Boolean
  
  /**
    * Only targets matching filter will be attached.
    */
  var filter: js.UndefOr[TargetFilter] = js.undefined
  
  /**
    * Enables "flat" access to the session via specifying sessionId attribute in the commands.
    * We plan to make this the default, deprecate non-flattened mode,
    * and eventually retire it. See crbug.com/991325.
    */
  var flatten: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to pause new targets when attaching to them. Use `Runtime.runIfWaitingForDebugger`
    * to run paused targets.
    */
  var waitForDebuggerOnStart: Boolean
}
object SetAutoAttachRequest {
  
  inline def apply(autoAttach: Boolean, waitForDebuggerOnStart: Boolean): SetAutoAttachRequest = {
    val __obj = js.Dynamic.literal(autoAttach = autoAttach.asInstanceOf[js.Any], waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAutoAttachRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetAutoAttachRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoAttach(value: Boolean): Self = StObject.set(x, "autoAttach", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: TargetFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterEntry*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
    
    inline def setWaitForDebuggerOnStart(value: Boolean): Self = StObject.set(x, "waitForDebuggerOnStart", value.asInstanceOf[js.Any])
  }
}
