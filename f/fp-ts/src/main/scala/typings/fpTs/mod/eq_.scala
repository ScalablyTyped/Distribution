package typings.fpTs.mod

import typings.fpTs.libContravariantMod.Contravariant1
import typings.fpTs.libEqMod.Eq
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libReadonlyRecordMod.ReadonlyRecord_
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eq_ {
  
  @JSImport("fp-ts", "eq")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "eq.Contravariant")
  @js.native
  val Contravariant: Contravariant1[typings.fpTs.libEqMod.URI] = js.native
  
  @JSImport("fp-ts", "eq.URI")
  @js.native
  val URI: /* "Eq" */ String = js.native
  
  inline def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Eq[A], Eq[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Eq[A], Eq[B]]]
  
  @JSImport("fp-ts", "eq.eqBoolean")
  @js.native
  val eqBoolean: Eq[Boolean] = js.native
  
  @JSImport("fp-ts", "eq.eqDate")
  @js.native
  val eqDate: Eq[js.Date] = js.native
  
  @JSImport("fp-ts", "eq.eqNumber")
  @js.native
  val eqNumber: Eq[Double] = js.native
  
  @JSImport("fp-ts", "eq.eqStrict")
  @js.native
  val eqStrict: Eq[Any] = js.native
  
  @JSImport("fp-ts", "eq.eqString")
  @js.native
  val eqString: Eq[String] = js.native
  
  @JSImport("fp-ts", "eq.eq")
  @js.native
  val eq_ : Contravariant1[typings.fpTs.libEqMod.URI] = js.native
  
  inline def fromEquals[A](equals: js.Function2[/* x */ A, /* y */ A, Boolean]): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEquals")(equals.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  inline def getMonoid[A](): Monoid[Eq[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[Eq[A]]]
  
  inline def getSemigroup[A](): Semigroup[Eq[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[Eq[A]]]
  
  inline def getStructEq[O /* <: ReadonlyRecord_[String, Any] */](
    eqs: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: fp-ts.fp-ts/lib/Eq.Eq<O[K]>} */ js.Any
  ): Eq[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStructEq")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[O]]
  
  inline def getTupleEq[T /* <: js.Array[Eq[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param eqs because its type T is not an array type */ eqs: T
  ): Eq[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Eq.Eq<infer A>? A : never} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleEq")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Eq.Eq<infer A>? A : never} */ js.Any
  ]]
  
  inline def strictEqual[A](a: A, b: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def struct[A](
    eqs: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>} */ js.Any
  ): Eq[
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[
    /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param eqs because its type {[ K in keyof A ]: Eq<A[K]>} is not an array type */ eqs: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>} */ js.Any
  ): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
