package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddHeapSnapshotChunkEvent extends StObject {
  
  var chunk: String
}
object AddHeapSnapshotChunkEvent {
  
  inline def apply(chunk: String): AddHeapSnapshotChunkEvent = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddHeapSnapshotChunkEvent]
  }
  
  extension [Self <: AddHeapSnapshotChunkEvent](x: Self) {
    
    inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
  }
}
