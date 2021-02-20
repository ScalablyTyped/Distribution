package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadDetails extends StObject {
  
  /**
    * Snapshot of CPU registers.
    */
  var context: CpuContext = js.native
  
  /**
    * OS-specific ID.
    */
  var id: ThreadId = js.native
  
  /**
    * Snapshot of state.
    */
  var state: ThreadState = js.native
}
object ThreadDetails {
  
  @scala.inline
  def apply(context: CpuContext, id: ThreadId, state: ThreadState): ThreadDetails = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadDetails]
  }
  
  @scala.inline
  implicit class ThreadDetailsMutableBuilder[Self <: ThreadDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: CpuContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ThreadId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ThreadState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
