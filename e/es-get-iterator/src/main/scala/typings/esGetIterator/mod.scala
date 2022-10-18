package typings.esGetIterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](iterable: T): InferIterable[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[InferIterable[T]]
  
  @JSImport("es-get-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends es-get-iterator.es-get-iterator.Iterable<infer TYield, infer TReturn, infer TNext> ? std.Iterator<TYield, TReturn, TNext> : unknown extends T ? std.Iterator<unknown, any, undefined> | undefined : undefined
    }}}
    */
  @js.native
  trait InferIterable[T] extends StObject
  
  @js.native
  trait Iterable[T, TReturn, TNext] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[T]] = js.native
  }
}
