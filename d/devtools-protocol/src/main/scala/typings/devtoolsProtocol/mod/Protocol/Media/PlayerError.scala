package typings.devtoolsProtocol.mod.Protocol.Media

import typings.devtoolsProtocol.devtoolsProtocolStrings.media_error
import typings.devtoolsProtocol.devtoolsProtocolStrings.pipeline_error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerError extends js.Object {
  /**
    * When this switches to using media::Status instead of PipelineStatus
    * we can remove "errorCode" and replace it with the fields from
    * a Status instance. This also seems like a duplicate of the error
    * level enum - there is a todo bug to have that level removed and
    * use this instead. (crbug.com/1068454)
    */
  var errorCode: String = js.native
  /**
    *  (PlayerErrorType enum)
    */
  var `type`: pipeline_error | media_error = js.native
}

object PlayerError {
  @scala.inline
  def apply(errorCode: String, `type`: pipeline_error | media_error): PlayerError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerError]
  }
  @scala.inline
  implicit class PlayerErrorOps[Self <: PlayerError] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: pipeline_error | media_error): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

