package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportHeapSnapshotProgressEvent extends StObject {
  
  var done: integer
  
  var finished: js.UndefOr[Boolean] = js.undefined
  
  var total: integer
}
object ReportHeapSnapshotProgressEvent {
  
  inline def apply(done: integer, total: integer): ReportHeapSnapshotProgressEvent = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportHeapSnapshotProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportHeapSnapshotProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setDone(value: integer): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    inline def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
