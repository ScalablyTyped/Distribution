package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyEventCallbacks[D, T, S] extends StObject {
  
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
  implicit class ProxyEventCallbacksMutableBuilder[Self <: ProxyEventCallbacks[_, _, _], D, T, S] (val x: Self with (ProxyEventCallbacks[D, T, S])) extends AnyVal {
    
    @scala.inline
    def setDealloc(value: js.ThisFunction0[/* this */ UserMethodInvocation[D, T, S], Unit]): Self = StObject.set(x, "dealloc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeallocUndefined: Self = StObject.set(x, "dealloc", js.undefined)
    
    @scala.inline
    def setForward(value: js.ThisFunction1[/* this */ UserMethodInvocation[D, T, S], /* name */ String, Unit]): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
  }
}
