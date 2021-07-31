package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddHeapSnapshotChunkEvent extends StObject {
  
  var chunk: String
}
object AddHeapSnapshotChunkEvent {
  
  @scala.inline
  def apply(chunk: String): AddHeapSnapshotChunkEvent = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddHeapSnapshotChunkEvent]
  }
  
  @scala.inline
  implicit class AddHeapSnapshotChunkEventMutableBuilder[Self <: AddHeapSnapshotChunkEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
  }
}
