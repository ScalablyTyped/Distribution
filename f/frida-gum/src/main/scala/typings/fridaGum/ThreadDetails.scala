package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadDetails extends StObject {
  
  /**
    * Snapshot of CPU registers.
    */
  var context: CpuContext
  
  /**
    * OS-specific ID.
    */
  var id: ThreadId
  
  /**
    * Snapshot of state.
    */
  var state: ThreadState
}
object ThreadDetails {
  
  inline def apply(context: CpuContext, id: ThreadId, state: ThreadState): ThreadDetails = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadDetails]
  }
  
  extension [Self <: ThreadDetails](x: Self) {
    
    inline def setContext(value: CpuContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setId(value: ThreadId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setState(value: ThreadState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
