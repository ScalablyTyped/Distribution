package typings.devtoolsProtocol.mod.Protocol.Tracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMemoryDumpRequest extends js.Object {
  
  /**
    * Enables more deterministic results by forcing garbage collection
    */
  var deterministic: js.UndefOr[Boolean] = js.native
}
object RequestMemoryDumpRequest {
  
  @scala.inline
  def apply(): RequestMemoryDumpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMemoryDumpRequest]
  }
  
  @scala.inline
  implicit class RequestMemoryDumpRequestOps[Self <: RequestMemoryDumpRequest] (val x: Self) extends AnyVal {
    
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
    def setDeterministic(value: Boolean): Self = this.set("deterministic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeterministic: Self = this.set("deterministic", js.undefined)
  }
}
