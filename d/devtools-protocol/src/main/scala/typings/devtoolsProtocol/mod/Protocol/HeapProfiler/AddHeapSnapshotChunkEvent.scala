package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddHeapSnapshotChunkEvent extends js.Object {
  var chunk: String = js.native
}

object AddHeapSnapshotChunkEvent {
  @scala.inline
  def apply(chunk: String): AddHeapSnapshotChunkEvent = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddHeapSnapshotChunkEvent]
  }
  @scala.inline
  implicit class AddHeapSnapshotChunkEventOps[Self <: AddHeapSnapshotChunkEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunk(value: String): Self = this.set("chunk", value.asInstanceOf[js.Any])
  }
  
}

