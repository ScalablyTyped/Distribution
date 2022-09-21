package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.anon.FnCallStartWithAs
import typings.fpTs.ordMod.Ord_
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.fpTs.semigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semigroup {
  
  @JSImport("fp-ts", "semigroup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatAll[A](S: Semigroup[A]): js.Function1[/* startWith */ A, js.Function1[/* as */ js.Array[A], A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* startWith */ A, js.Function1[/* as */ js.Array[A], A]]]
  
  inline def constant[A](a: A): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(a.asInstanceOf[js.Any]).asInstanceOf[Semigroup[A]]
  
  inline def first[A](): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[Semigroup[A]]
  
  inline def fold[A](S: Semigroup[A]): FnCallStartWithAs[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(S.asInstanceOf[js.Any]).asInstanceOf[FnCallStartWithAs[A]]
  
  inline def getDualSemigroup[A](S: Semigroup[A]): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDualSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[A]]
  
  inline def getFirstSemigroup[A](): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstSemigroup")().asInstanceOf[Semigroup[A]]
  
  inline def getFunctionSemigroup[S](S: Semigroup[S]): js.Function0[Semigroup[js.Function1[/* a */ scala.Nothing, S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Semigroup[js.Function1[/* a */ scala.Nothing, S]]]]
  
  inline def getIntercalateSemigroup[A](middle: A): js.Function1[/* S */ Semigroup[A], Semigroup[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntercalateSemigroup")(middle.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* S */ Semigroup[A], Semigroup[A]]]
  
  inline def getJoinSemigroup[A](O: Ord_[A]): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJoinSemigroup")(O.asInstanceOf[js.Any]).asInstanceOf[Semigroup[A]]
  
  inline def getLastSemigroup[A](): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastSemigroup")().asInstanceOf[Semigroup[A]]
  
  inline def getMeetSemigroup[A](O: Ord_[A]): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeetSemigroup")(O.asInstanceOf[js.Any]).asInstanceOf[Semigroup[A]]
  
  inline def getObjectSemigroup[A /* <: js.Object */](): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSemigroup")().asInstanceOf[Semigroup[A]]
  
  inline def getStructSemigroup[O /* <: ReadonlyRecord_[String, Any] */](
    semigroups: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Semigroup.Semigroup<O[K]>}
    */ typings.fpTs.fpTsStrings.getStructSemigroup & TopLevel[O]
  ): Semigroup[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStructSemigroup")(semigroups.asInstanceOf[js.Any]).asInstanceOf[Semigroup[O]]
  
  inline def getTupleSemigroup[T /* <: js.Array[Semigroup[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param semigroups because its type T is not an array type */ semigroups: T
  ): Semigroup[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Semigroup.Semigroup<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleSemigroup & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleSemigroup")(semigroups.asInstanceOf[js.Any]).asInstanceOf[Semigroup[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Semigroup.Semigroup<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleSemigroup & TopLevel[T]
  ]]
  
  inline def intercalate[A](middle: A): js.Function1[/* S */ Semigroup[A], Semigroup[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intercalate")(middle.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* S */ Semigroup[A], Semigroup[A]]]
  
  inline def last[A](): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[Semigroup[A]]
  
  inline def max[A](O: Ord_[A]): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(O.asInstanceOf[js.Any]).asInstanceOf[Semigroup[A]]
  
  inline def min[A](O: Ord_[A]): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(O.asInstanceOf[js.Any]).asInstanceOf[Semigroup[A]]
  
  inline def reverse[A](S: Semigroup[A]): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[A]]
  
  @JSImport("fp-ts", "semigroup.semigroupAll")
  @js.native
  val semigroupAll: Semigroup[Boolean] = js.native
  
  @JSImport("fp-ts", "semigroup.semigroupAny")
  @js.native
  val semigroupAny: Semigroup[Boolean] = js.native
  
  @JSImport("fp-ts", "semigroup.semigroupProduct")
  @js.native
  val semigroupProduct: Semigroup[Double] = js.native
  
  @JSImport("fp-ts", "semigroup.semigroupString")
  @js.native
  val semigroupString: Semigroup[String] = js.native
  
  @JSImport("fp-ts", "semigroup.semigroupSum")
  @js.native
  val semigroupSum: Semigroup[Double] = js.native
  
  @JSImport("fp-ts", "semigroup.semigroupVoid")
  @js.native
  val semigroupVoid: Semigroup[Unit] = js.native
  
  inline def struct[A](
    semigroups: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Semigroup.Semigroup<A[K]>}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ): Semigroup[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K_1 in keyof A ]: A[K_1]}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(semigroups.asInstanceOf[js.Any]).asInstanceOf[Semigroup[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K_1 in keyof A ]: A[K_1]}
    */ typings.fpTs.fpTsStrings.struct & TopLevel[A]
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param semigroups because its type {[ K in keyof A ]: Semigroup<A[K]>} is not an array type */ semigroups: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Semigroup.Semigroup<A[K]>}
    */ typings.fpTs.fpTsStrings.tuple & TopLevel[A]
  ): Semigroup[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(semigroups.asInstanceOf[js.Any]).asInstanceOf[Semigroup[A]]
}
