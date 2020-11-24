package typings.enhancedResolve.commonTypesMod

import typings.enhancedResolve.anon.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingCallbackTools extends js.Object {
  
  var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  
  var missing: js.UndefOr[js.Array[String] | Push] = js.native
  
  var stack: js.UndefOr[js.Array[String]] = js.native
}
object LoggingCallbackTools {
  
  @scala.inline
  def apply(): LoggingCallbackTools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingCallbackTools]
  }
  
  @scala.inline
  implicit class LoggingCallbackToolsOps[Self <: LoggingCallbackTools] (val x: Self) extends AnyVal {
    
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
    def setLog(value: /* msg */ String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setMissingVarargs(value: String*): Self = this.set("missing", js.Array(value :_*))
    
    @scala.inline
    def setMissing(value: js.Array[String] | Push): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
    
    @scala.inline
    def setStackVarargs(value: String*): Self = this.set("stack", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: js.Array[String]): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
