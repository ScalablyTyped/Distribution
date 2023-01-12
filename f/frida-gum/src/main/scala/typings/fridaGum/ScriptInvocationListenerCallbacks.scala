package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptInvocationListenerCallbacks
  extends StObject
     with InvocationListenerCallbacks {
  
  /**
    * Called synchronously when a thread is about to enter the target function.
    */
  var onEnter: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]
  ] = js.undefined
  
  /**
    * Called synchronously when a thread is about to leave the target function.
    */
  var onLeave: js.UndefOr[
    js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]
  ] = js.undefined
}
object ScriptInvocationListenerCallbacks {
  
  inline def apply(): ScriptInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptInvocationListenerCallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptInvocationListenerCallbacks] (val x: Self) extends AnyVal {
    
    inline def setOnEnter(value: js.ThisFunction1[/* this */ InvocationContext, /* args */ InvocationArguments, Unit]): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnLeave(value: js.ThisFunction1[/* this */ InvocationContext, /* retval */ InvocationReturnValue, Unit]): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
  }
}
