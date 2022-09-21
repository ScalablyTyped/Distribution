package typings.esGetIterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](iterable: T): InferIterable[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[InferIterable[T]]
  
  @JSImport("es-get-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type InferIterable[T] = js.UndefOr[js.Iterator[Any]]
  
  @js.native
  trait Iterable[T, TReturn, TNext] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[T]] = js.native
  }
}
