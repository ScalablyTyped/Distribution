package typings.flatry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](fn: js.Function0[T]): js.Array[Any] | (js.Tuple2[Null, T]) = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | (js.Tuple2[Null, T])]
  inline def apply[T](promise: js.Promise[T]): js.Promise[js.Array[Any] | (js.Tuple2[Null, T])] = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any] | (js.Tuple2[Null, T])]]
  
  @JSImport("flatry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
