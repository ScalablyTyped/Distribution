package typings.diagnosticChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpanContext extends js.Object {
  
  var spanId: String = js.native
  
  var traceFlags: js.UndefOr[String] = js.native
  
  var traceId: String = js.native
  
  var tracestate: js.UndefOr[String] = js.native
}
object ISpanContext {
  
  @scala.inline
  def apply(spanId: String, traceId: String): ISpanContext = {
    val __obj = js.Dynamic.literal(spanId = spanId.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpanContext]
  }
  
  @scala.inline
  implicit class ISpanContextOps[Self <: ISpanContext] (val x: Self) extends AnyVal {
    
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
    def setSpanId(value: String): Self = this.set("spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceFlags(value: String): Self = this.set("traceFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceFlags: Self = this.set("traceFlags", js.undefined)
    
    @scala.inline
    def setTracestate(value: String): Self = this.set("tracestate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracestate: Self = this.set("tracestate", js.undefined)
  }
}
