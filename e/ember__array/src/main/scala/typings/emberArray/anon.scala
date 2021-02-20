package typings.emberArray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0[T] extends StObject {
    
    def apply(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], _]): js.UndefOr[T] = js.native
    def apply(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], _],
      thisArg: js.Any
    ): js.UndefOr[T] = js.native
    def apply[S /* <: T */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ T, 
          /* index */ Double, 
          /* obj */ js.Array[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    def apply[S /* <: T */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ T, 
          /* index */ Double, 
          /* obj */ js.Array[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = js.native
  }
  
  @js.native
  trait Fn1[T] extends StObject {
    
    def apply(predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): Boolean = js.native
    def apply(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
      thisArg: js.Any
    ): Boolean = js.native
  }
  
  @js.native
  trait FnCall[T] extends StObject {
    
    def apply(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    def apply(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallCallbackfnInitialValue[T] extends StObject {
    
    def apply(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          T
        ]
    ): T = js.native
    def apply(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          T
        ],
      initialValue: T
    ): T = js.native
  }
  
  @js.native
  trait FnCallCallbackfnThisArg[T] extends StObject {
    
    def apply[U](callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]): js.Array[U] = js.native
    def apply[U](
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
  }
  
  @js.native
  trait FnCallPredicateThisArg[T] extends StObject {
    
    def apply(predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): js.Array[T] = js.native
    def apply(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
      thisArg: js.Any
    ): js.Array[T] = js.native
  }
}
