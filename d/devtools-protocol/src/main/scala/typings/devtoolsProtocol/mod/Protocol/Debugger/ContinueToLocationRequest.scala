package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.any
import typings.devtoolsProtocol.devtoolsProtocolStrings.current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueToLocationRequest extends js.Object {
  
  /**
    * Location to continue to.
    */
  var location: Location = js.native
  
  /**
    *  (ContinueToLocationRequestTargetCallFrames enum)
    */
  var targetCallFrames: js.UndefOr[any | current] = js.native
}
object ContinueToLocationRequest {
  
  @scala.inline
  def apply(location: Location): ContinueToLocationRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueToLocationRequest]
  }
  
  @scala.inline
  implicit class ContinueToLocationRequestOps[Self <: ContinueToLocationRequest] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCallFrames(value: any | current): Self = this.set("targetCallFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCallFrames: Self = this.set("targetCallFrames", js.undefined)
  }
}
