package typings.devtoolsProtocol.mod.Protocol.Memory

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSamplingRequest extends js.Object {
  
  /**
    * Average number of bytes between samples.
    */
  var samplingInterval: js.UndefOr[integer] = js.native
  
  /**
    * Do not randomize intervals between samples.
    */
  var suppressRandomness: js.UndefOr[Boolean] = js.native
}
object StartSamplingRequest {
  
  @scala.inline
  def apply(): StartSamplingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSamplingRequest]
  }
  
  @scala.inline
  implicit class StartSamplingRequestOps[Self <: StartSamplingRequest] (val x: Self) extends AnyVal {
    
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
    def setSamplingInterval(value: integer): Self = this.set("samplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingInterval: Self = this.set("samplingInterval", js.undefined)
    
    @scala.inline
    def setSuppressRandomness(value: Boolean): Self = this.set("suppressRandomness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressRandomness: Self = this.set("suppressRandomness", js.undefined)
  }
}
