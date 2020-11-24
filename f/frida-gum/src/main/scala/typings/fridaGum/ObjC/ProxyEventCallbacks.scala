package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyEventCallbacks[D, T, S] extends js.Object {
  
  /**
    * Gets notified right after the object has been deallocated.
    *
    * This is where you might clean up any associated state.
    */
  var dealloc: js.UndefOr[js.ThisFunction0[/* this */ UserMethodInvocation[D, T, S], Unit]] = js.native
  
  /**
    * Gets notified about the method name that we’re about to forward
    * a call to.
    *
    * This might be where you’d start out with a temporary callback
    * that just logs the names to help you decide which methods to
    * override.
    *
    * @param name Name of method that is about to get called.
    */
  var forward: js.UndefOr[
    js.ThisFunction1[/* this */ UserMethodInvocation[D, T, S], /* name */ String, Unit]
  ] = js.native
}
object ProxyEventCallbacks {
  
  @scala.inline
  def apply[D, T, S](): ProxyEventCallbacks[D, T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyEventCallbacks[D, T, S]]
  }
  
  @scala.inline
  implicit class ProxyEventCallbacksOps[Self <: ProxyEventCallbacks[_, _, _], D, T, S] (val x: Self with (ProxyEventCallbacks[D, T, S])) extends AnyVal {
    
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
    def setDealloc(value: js.ThisFunction0[/* this */ UserMethodInvocation[D, T, S], Unit]): Self = this.set("dealloc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealloc: Self = this.set("dealloc", js.undefined)
    
    @scala.inline
    def setForward(value: js.ThisFunction1[/* this */ UserMethodInvocation[D, T, S], /* name */ String, Unit]): Self = this.set("forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
  }
}
