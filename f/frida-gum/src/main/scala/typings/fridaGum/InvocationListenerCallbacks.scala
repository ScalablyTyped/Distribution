package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callbacks to invoke synchronously before and after a function call.
  */
/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ScriptInvocationListenerCallbacks
  - typings.fridaGum.NativeInvocationListenerCallbacks
*/
trait InvocationListenerCallbacks extends StObject
object InvocationListenerCallbacks {
  
  @scala.inline
  def NativeInvocationListenerCallbacks(): typings.fridaGum.NativeInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fridaGum.NativeInvocationListenerCallbacks]
  }
  
  @scala.inline
  def ScriptInvocationListenerCallbacks(): typings.fridaGum.ScriptInvocationListenerCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.fridaGum.ScriptInvocationListenerCallbacks]
  }
}
