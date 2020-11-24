package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptInvocationListenerCallbacks extends InvocationListenerCallbacks {
  
  /**
    * Called synchronously when a thread is about to enter the target function.
    */
  var onEnter: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]
  ] = js.native
  
  /**
    * Called synchronously when a thread is about to leave the target function.
    */
  var onLeave: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]
  ] = js.native
}
object ScriptInvocationListenerCallbacks {
  
  @scala.inline
  def apply(): ScriptInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptInvocationListenerCallbacks]
  }
  
  @scala.inline
  implicit class ScriptInvocationListenerCallbacksOps[Self <: ScriptInvocationListenerCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnEnter(value: js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnLeave(value: js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]): Self = this.set("onLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
  }
}
