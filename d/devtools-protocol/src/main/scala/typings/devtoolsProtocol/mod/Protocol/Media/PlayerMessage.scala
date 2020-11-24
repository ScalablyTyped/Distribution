package typings.devtoolsProtocol.mod.Protocol.Media

import typings.devtoolsProtocol.devtoolsProtocolStrings.debug
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerMessage extends js.Object {
  
  /**
    * Keep in sync with MediaLogMessageLevel
    * We are currently keeping the message level 'error' separate from the
    * PlayerError type because right now they represent different things,
    * this one being a DVLOG(ERROR) style log message that gets printed
    * based on what log level is selected in the UI, and the other is a
    * representation of a media::PipelineStatus object. Soon however we're
    * going to be moving away from using PipelineStatus for errors and
    * introducing a new error type which should hopefully let us integrate
    * the error log level into the PlayerError type. (PlayerMessageLevel enum)
    */
  var level: error | warning | info | debug = js.native
  
  var message: String = js.native
}
object PlayerMessage {
  
  @scala.inline
  def apply(level: error | warning | info | debug, message: String): PlayerMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerMessage]
  }
  
  @scala.inline
  implicit class PlayerMessageOps[Self <: PlayerMessage] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: error | warning | info | debug): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
