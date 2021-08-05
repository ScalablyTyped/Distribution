package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.contravariantMod.Contravariant1
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eqMod {
  
  @JSImport("fp-ts/lib/Eq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Eq", "Contravariant")
  @js.native
  val Contravariant: Contravariant1[typings.fpTs.eqMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Eq", "URI")
  @js.native
  val URI: /* "Eq" */ String = js.native
  type URI = /* "Eq" */ String
  
  inline def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Eq[A], Eq[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Eq[A], Eq[B]]]
  
  @JSImport("fp-ts/lib/Eq", "eqBoolean")
  @js.native
  val eqBoolean: Eq[Boolean] = js.native
  
  @JSImport("fp-ts/lib/Eq", "eqDate")
  @js.native
  val eqDate: Eq[Date] = js.native
  
  @JSImport("fp-ts/lib/Eq", "eqNumber")
  @js.native
  val eqNumber: Eq[Double] = js.native
  
  @JSImport("fp-ts/lib/Eq", "eqStrict")
  @js.native
  val eqStrict: Eq[js.Any] = js.native
  
  @JSImport("fp-ts/lib/Eq", "eqString")
  @js.native
  val eqString: Eq[String] = js.native
  
  @JSImport("fp-ts/lib/Eq", "eq")
  @js.native
  val eq_ : Contravariant1[typings.fpTs.eqMod.URI] = js.native
  
  inline def fromEquals[A](equals: js.Function2[/* x */ A, /* y */ A, Boolean]): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEquals")(equals.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  inline def getMonoid[A](): Monoid[Eq[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[Eq[A]]]
  
  inline def getStructEq[O /* <: ReadonlyRecord_[String, js.Any] */](
    eqs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Eq.Eq<O[K]>}
    */ typings.fpTs.fpTsStrings.getStructEq & TopLevel[O]
  ): Eq[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStructEq")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[O]]
  
  inline def getTupleEq[T /* <: js.Array[Eq[js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param eqs because its type T is not an array type */ eqs: T
  ): Eq[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Eq.Eq<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleEq & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleEq")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Eq.Eq<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleEq & TopLevel[T]
  ]]
  
  inline def strictEqual[A](a: A, b: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Eq[A] extends StObject {
    
    def equals(x: A, y: A): Boolean
  }
  object Eq {
    
    inline def apply[A](equals_ : (A, A) => Boolean): Eq[A] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[Eq[A]]
    }
    
    extension [Self <: Eq[?], A](x: Self & Eq[A]) {
      
      inline def setEquals_(value: (A, A) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    }
  }
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
