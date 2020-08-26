package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.mhtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureSnapshotRequest extends js.Object {
  /**
    * Format (defaults to mhtml). (CaptureSnapshotRequestFormat enum)
    */
  var format: js.UndefOr[mhtml] = js.native
}

object CaptureSnapshotRequest {
  @scala.inline
  def apply(): CaptureSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureSnapshotRequest]
  }
  @scala.inline
  implicit class CaptureSnapshotRequestOps[Self <: CaptureSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setFormat(value: mhtml): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

