package typings.expressWinston.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorLoggerOptionsWithTransports
  extends BaseErrorLoggerOptions
     with ErrorLoggerOptions {
  
  var transports: js.Array[typings.winstonTransport.mod.^] = js.native
}
object ErrorLoggerOptionsWithTransports {
  
  @scala.inline
  def apply(transports: js.Array[typings.winstonTransport.mod.^]): ErrorLoggerOptionsWithTransports = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLoggerOptionsWithTransports]
  }
  
  @scala.inline
  implicit class ErrorLoggerOptionsWithTransportsOps[Self <: ErrorLoggerOptionsWithTransports] (val x: Self) extends AnyVal {
    
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
    def setTransportsVarargs(value: typings.winstonTransport.mod.^ *): Self = this.set("transports", js.Array(value :_*))
    
    @scala.inline
    def setTransports(value: js.Array[typings.winstonTransport.mod.^]): Self = this.set("transports", value.asInstanceOf[js.Any])
  }
}
