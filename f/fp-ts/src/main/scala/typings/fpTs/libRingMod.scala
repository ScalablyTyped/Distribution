package typings.fpTs

import typings.fpTs.libSemiringMod.Semiring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRingMod {
  
  @JSImport("fp-ts/lib/Ring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFunctionRing[A, B](R: Ring[B]): Ring[js.Function1[/* a */ A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionRing")(R.asInstanceOf[js.Any]).asInstanceOf[Ring[js.Function1[/* a */ A, B]]]
  
  inline def getTupleRing[T /* <: js.Array[Ring[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rings because its type T is not an array type */ rings: T
  ): Ring[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ring.Ring<infer A>? A : never} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleRing")(rings.asInstanceOf[js.Any]).asInstanceOf[Ring[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ring.Ring<infer A>? A : never} */ js.Any
  ]]
  
  inline def negate[A](R: Ring[A]): js.Function1[/* a */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(R.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, A]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rings because its type {[ K in keyof A ]: Ring<A[K]>} is not an array type */ rings: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Ring.Ring<A[K]>} */ js.Any
  ): Ring[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(rings.asInstanceOf[js.Any]).asInstanceOf[Ring[A]]
  
  trait Ring[A]
    extends StObject
       with Semiring[A] {
    
    def sub(x: A, y: A): A
  }
  object Ring {
    
    inline def apply[A](add: (A, A) => A, mul: (A, A) => A, one: A, sub: (A, A) => A, zero: A): Ring[A] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), mul = js.Any.fromFunction2(mul), one = one.asInstanceOf[js.Any], sub = js.Any.fromFunction2(sub), zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ring[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ring[?], A] (val x: Self & Ring[A]) extends AnyVal {
      
      inline def setSub(value: (A, A) => A): Self = StObject.set(x, "sub", js.Any.fromFunction2(value))
    }
  }
}
