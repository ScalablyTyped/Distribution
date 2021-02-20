package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeInvocationListenerCallbacks extends InvocationListenerCallbacks {
  
  /**
    * Called synchronously when a thread is about to enter the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onEnter (GumInvocationContext * ic)`
    */
  var onEnter: js.UndefOr[NativePointer] = js.native
  
  /**
    * Called synchronously when a thread is about to leave the target function.
    *
    * Typically implemented using `CModule`.
    *
    * Signature: `void onLeave (GumInvocationContext * ic)`
    */
  var onLeave: js.UndefOr[NativePointer] = js.native
}
object NativeInvocationListenerCallbacks {
  
  @scala.inline
  def apply(): NativeInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeInvocationListenerCallbacks]
  }
  
  @scala.inline
  implicit class NativeInvocationListenerCallbacksMutableBuilder[Self <: NativeInvocationListenerCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnEnter(value: NativePointer): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    @scala.inline
    def setOnLeave(value: NativePointer): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
  }
}
