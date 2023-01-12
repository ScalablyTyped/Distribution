package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthBooleans.`false`
import typings.firebaseAuth.firebaseAuthBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcPlatformBrowserMessagechannelPromiseMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/platform_browser/messagechannel/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allSettled[T](promises: js.Array[js.Promise[T]]): js.Promise[js.Array[PromiseSettledResult[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_allSettled")(promises.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PromiseSettledResult[T]]]]
  
  trait PromiseFulfilledResult[T]
    extends StObject
       with PromiseSettledResult[T] {
    
    var fulfilled: `true`
    
    var value: T
  }
  object PromiseFulfilledResult {
    
    inline def apply[T](value: T): PromiseFulfilledResult[T] = {
      val __obj = js.Dynamic.literal(fulfilled = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseFulfilledResult[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseFulfilledResult[?], T] (val x: Self & PromiseFulfilledResult[T]) extends AnyVal {
      
      inline def setFulfilled(value: `true`): Self = StObject.set(x, "fulfilled", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromiseRejectedResult
    extends StObject
       with PromiseSettledResult[Any] {
    
    var fulfilled: `false`
    
    var reason: Any
  }
  object PromiseRejectedResult {
    
    inline def apply(reason: Any): PromiseRejectedResult = {
      val __obj = js.Dynamic.literal(fulfilled = false, reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseRejectedResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseRejectedResult] (val x: Self) extends AnyVal {
      
      inline def setFulfilled(value: `false`): Self = StObject.set(x, "fulfilled", value.asInstanceOf[js.Any])
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelPromiseMod.PromiseFulfilledResult[T]
    - typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelPromiseMod.PromiseRejectedResult
  */
  trait PromiseSettledResult[T] extends StObject
  object PromiseSettledResult {
    
    inline def PromiseFulfilledResult[T](value: T): typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelPromiseMod.PromiseFulfilledResult[T] = {
      val __obj = js.Dynamic.literal(fulfilled = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelPromiseMod.PromiseFulfilledResult[T]]
    }
    
    inline def PromiseRejectedResult(reason: Any): typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelPromiseMod.PromiseRejectedResult = {
      val __obj = js.Dynamic.literal(fulfilled = false, reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAuth.distNodeEsmSrcPlatformBrowserMessagechannelPromiseMod.PromiseRejectedResult]
    }
  }
}
