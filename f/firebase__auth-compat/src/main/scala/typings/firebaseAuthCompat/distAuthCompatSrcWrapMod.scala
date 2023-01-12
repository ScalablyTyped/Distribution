package typings.firebaseAuthCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthCompatSrcWrapMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unwrap[T](`object`: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def wrapped[T](`object`: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapped")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  trait ReverseWrapper[T] extends StObject {
    
    def wrapped(): T
  }
  object ReverseWrapper {
    
    inline def apply[T](wrapped: () => T): ReverseWrapper[T] = {
      val __obj = js.Dynamic.literal(wrapped = js.Any.fromFunction0(wrapped))
      __obj.asInstanceOf[ReverseWrapper[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReverseWrapper[?], T] (val x: Self & ReverseWrapper[T]) extends AnyVal {
      
      inline def setWrapped(value: () => T): Self = StObject.set(x, "wrapped", js.Any.fromFunction0(value))
    }
  }
  
  trait Wrapper[T] extends StObject {
    
    def unwrap(): T
  }
  object Wrapper {
    
    inline def apply[T](unwrap: () => T): Wrapper[T] = {
      val __obj = js.Dynamic.literal(unwrap = js.Any.fromFunction0(unwrap))
      __obj.asInstanceOf[Wrapper[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Wrapper[?], T] (val x: Self & Wrapper[T]) extends AnyVal {
      
      inline def setUnwrap(value: () => T): Self = StObject.set(x, "unwrap", js.Any.fromFunction0(value))
    }
  }
}
