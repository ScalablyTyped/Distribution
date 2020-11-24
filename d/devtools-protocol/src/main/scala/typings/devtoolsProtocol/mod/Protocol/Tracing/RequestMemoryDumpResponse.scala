package typings.devtoolsProtocol.mod.Protocol.Tracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMemoryDumpResponse extends js.Object {
  
  /**
    * GUID of the resulting global memory dump.
    */
  var dumpGuid: String = js.native
  
  /**
    * True iff the global memory dump succeeded.
    */
  var success: Boolean = js.native
}
object RequestMemoryDumpResponse {
  
  @scala.inline
  def apply(dumpGuid: String, success: Boolean): RequestMemoryDumpResponse = {
    val __obj = js.Dynamic.literal(dumpGuid = dumpGuid.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMemoryDumpResponse]
  }
  
  @scala.inline
  implicit class RequestMemoryDumpResponseOps[Self <: RequestMemoryDumpResponse] (val x: Self) extends AnyVal {
    
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
    def setDumpGuid(value: String): Self = this.set("dumpGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
