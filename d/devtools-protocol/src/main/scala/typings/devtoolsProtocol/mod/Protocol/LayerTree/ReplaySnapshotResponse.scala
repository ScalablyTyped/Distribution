package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaySnapshotResponse extends js.Object {
  /**
    * A data: URL for resulting image.
    */
  var dataURL: String = js.native
}

object ReplaySnapshotResponse {
  @scala.inline
  def apply(dataURL: String): ReplaySnapshotResponse = {
    val __obj = js.Dynamic.literal(dataURL = dataURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaySnapshotResponse]
  }
  @scala.inline
  implicit class ReplaySnapshotResponseOps[Self <: ReplaySnapshotResponse] (val x: Self) extends AnyVal {
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
    def setDataURL(value: String): Self = this.set("dataURL", value.asInstanceOf[js.Any])
  }
  
}

