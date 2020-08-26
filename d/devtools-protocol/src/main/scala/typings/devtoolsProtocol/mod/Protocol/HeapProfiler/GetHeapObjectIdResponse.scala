package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHeapObjectIdResponse extends js.Object {
  /**
    * Id of the heap snapshot object corresponding to the passed remote object id.
    */
  var heapSnapshotObjectId: HeapSnapshotObjectId = js.native
}

object GetHeapObjectIdResponse {
  @scala.inline
  def apply(heapSnapshotObjectId: HeapSnapshotObjectId): GetHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(heapSnapshotObjectId = heapSnapshotObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdResponse]
  }
  @scala.inline
  implicit class GetHeapObjectIdResponseOps[Self <: GetHeapObjectIdResponse] (val x: Self) extends AnyVal {
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
    def setHeapSnapshotObjectId(value: HeapSnapshotObjectId): Self = this.set("heapSnapshotObjectId", value.asInstanceOf[js.Any])
  }
  
}

