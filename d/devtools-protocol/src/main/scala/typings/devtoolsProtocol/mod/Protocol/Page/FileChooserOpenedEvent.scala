package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.selectMultiple
import typings.devtoolsProtocol.devtoolsProtocolStrings.selectSingle
import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileChooserOpenedEvent extends js.Object {
  /**
    * Input node id.
    */
  var backendNodeId: BackendNodeId = js.native
  /**
    * Id of the frame containing input node.
    */
  var frameId: FrameId = js.native
  /**
    * Input mode. (FileChooserOpenedEventMode enum)
    */
  var mode: selectSingle | selectMultiple = js.native
}

object FileChooserOpenedEvent {
  @scala.inline
  def apply(backendNodeId: BackendNodeId, frameId: FrameId, mode: selectSingle | selectMultiple): FileChooserOpenedEvent = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChooserOpenedEvent]
  }
  @scala.inline
  implicit class FileChooserOpenedEventOps[Self <: FileChooserOpenedEvent] (val x: Self) extends AnyVal {
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
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameId(value: FrameId): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: selectSingle | selectMultiple): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
  
}

