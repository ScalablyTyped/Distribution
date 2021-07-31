package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.semiringMod.Semiring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ringMod {
  
  @JSImport("fp-ts/lib/Ring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFunctionRing[A, B](ring: Ring[B]): Ring[js.Function1[/* a */ A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionRing")(ring.asInstanceOf[js.Any]).asInstanceOf[Ring[js.Function1[/* a */ A, B]]]
  
  @scala.inline
  def getTupleRing[T /* <: js.Array[Ring[js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rings because its type T is not an array type */ rings: T
  ): Ring[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ring.Ring<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleRing & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleRing")(rings.asInstanceOf[js.Any]).asInstanceOf[Ring[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ring.Ring<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleRing & TopLevel[T]
  ]]
  
  @scala.inline
  def negate[A](ring: Ring[A]): js.Function1[/* a */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(ring.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, A]]
  
  trait Ring[A]
    extends StObject
       with Semiring[A] {
    
    def sub(x: A, y: A): A
  }
  object Ring {
    
    @scala.inline
    def apply[A](add: (A, A) => A, mul: (A, A) => A, one: A, sub: (A, A) => A, zero: A): Ring[A] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), mul = js.Any.fromFunction2(mul), one = one.asInstanceOf[js.Any], sub = js.Any.fromFunction2(sub), zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ring[A]]
    }
    
    @scala.inline
    implicit class RingMutableBuilder[Self <: Ring[?], A] (val x: Self & Ring[A]) extends AnyVal {
      
      @scala.inline
      def setSub(value: (A, A) => A): Self = StObject.set(x, "sub", js.Any.fromFunction2(value))
    }
  }
}
