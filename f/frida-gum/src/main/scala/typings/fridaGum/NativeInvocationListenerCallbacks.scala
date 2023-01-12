package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeInvocationListenerCallbacks
  extends StObject
     with InvocationListenerCallbacks {
  
  /**
    * Called synchronously when a thread is about to enter the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onEnter (GumInvocationContext * ic)`
    */
  var onEnter: js.UndefOr[NativePointer] = js.undefined
  
  /**
    * Called synchronously when a thread is about to leave the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onLeave (GumInvocationContext * ic)`
    */
  var onLeave: js.UndefOr[NativePointer] = js.undefined
}
object NativeInvocationListenerCallbacks {
  
  inline def apply(): NativeInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeInvocationListenerCallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeInvocationListenerCallbacks] (val x: Self) extends AnyVal {
    
    inline def setOnEnter(value: NativePointer): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnLeave(value: NativePointer): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
  }
}
