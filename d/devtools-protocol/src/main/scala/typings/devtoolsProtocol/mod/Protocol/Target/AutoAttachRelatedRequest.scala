package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoAttachRelatedRequest extends StObject {
  
  /**
    * Only targets matching filter will be attached.
    */
  var filter: js.UndefOr[TargetFilter] = js.undefined
  
  var targetId: TargetID
  
  /**
    * Whether to pause new targets when attaching to them. Use `Runtime.runIfWaitingForDebugger`
    * to run paused targets.
    */
  var waitForDebuggerOnStart: Boolean
}
object AutoAttachRelatedRequest {
  
  inline def apply(targetId: TargetID, waitForDebuggerOnStart: Boolean): AutoAttachRelatedRequest = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any], waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoAttachRelatedRequest]
  }
  
  extension [Self <: AutoAttachRelatedRequest](x: Self) {
    
    inline def setFilter(value: TargetFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterEntry*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setWaitForDebuggerOnStart(value: Boolean): Self = StObject.set(x, "waitForDebuggerOnStart", value.asInstanceOf[js.Any])
  }
}
