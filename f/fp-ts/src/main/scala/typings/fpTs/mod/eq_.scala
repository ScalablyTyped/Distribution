package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.contravariantMod.Contravariant1
import typings.fpTs.eqMod.Eq
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.fpTs.semigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eq_ {
  
  @JSImport("fp-ts", "eq")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "eq.Contravariant")
  @js.native
  val Contravariant: Contravariant1[typings.fpTs.eqMod.URI] = js.native
  
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
  val eq_ : Contravariant1[typings.fpTs.eqMod.URI] = js.native
  
  inline def fromEquals[A](equals: js.Function2[/* x */ A, /* y */ A, Boolean]): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEquals")(equals.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  inline def getMonoid[A](): Monoid[Eq[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[Eq[A]]]
  
  inline def getSemigroup[A](): Semigroup[Eq[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[Eq[A]]]
  
  inline def getStructEq[O /* <: ReadonlyRecord_[String, Any] */](
    eqs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Eq.Eq<O[K]>}
    */ typings.fpTs.fpTsStrings.getStructEq & TopLevel[O]
  ): Eq[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStructEq")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[O]]
  
  inline def getTupleEq[T /* <: js.Array[Eq[Any]] */](
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
  
  inline def struct[A](
    eqs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ): Eq[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K_1 in keyof A ]: A[K_1]}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K_1 in keyof A ]: A[K_1]}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param eqs because its type {[ K in keyof A ]: Eq<A[K]>} is not an array type */ eqs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>}
    */ typings.fpTs.fpTsStrings.tuple & TopLevel[A]
  ): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
