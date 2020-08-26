package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreencastFrameEvent extends js.Object {
  /**
    * Base64-encoded compressed image.
    */
  var data: String = js.native
  /**
    * Screencast frame metadata.
    */
  var metadata: ScreencastFrameMetadata = js.native
  /**
    * Frame number.
    */
  var sessionId: integer = js.native
}

object ScreencastFrameEvent {
  @scala.inline
  def apply(data: String, metadata: ScreencastFrameMetadata, sessionId: integer): ScreencastFrameEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreencastFrameEvent]
  }
  @scala.inline
  implicit class ScreencastFrameEventOps[Self <: ScreencastFrameEvent] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ScreencastFrameMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: integer): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

