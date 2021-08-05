package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.boundedMod.Bounded
import typings.fpTs.functionMod.Endomorphism
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monoid {
  
  @JSImport("fp-ts", "monoid")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fold[A](M: Monoid[A]): js.Function1[/* as */ js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], A]]
  
  inline def getDualMonoid[A](M: Monoid[A]): Monoid[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDualMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[A]]
  
  inline def getEndomorphismMonoid[A](): Monoid[Endomorphism[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndomorphismMonoid")().asInstanceOf[Monoid[Endomorphism[A]]]
  
  inline def getFunctionMonoid[M](M: Monoid[M]): js.Function0[Monoid[js.Function1[/* a */ scala.Nothing, M]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Monoid[js.Function1[/* a */ scala.Nothing, M]]]]
  
  inline def getJoinMonoid[A](B: Bounded[A]): Monoid[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJoinMonoid")(B.asInstanceOf[js.Any]).asInstanceOf[Monoid[A]]
  
  inline def getMeetMonoid[A](B: Bounded[A]): Monoid[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeetMonoid")(B.asInstanceOf[js.Any]).asInstanceOf[Monoid[A]]
  
  inline def getStructMonoid[O /* <: ReadonlyRecord_[String, js.Any] */](
    monoids: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: fp-ts.fp-ts/lib/Monoid.Monoid<O[K]>}
    */ typings.fpTs.fpTsStrings.getStructMonoid & TopLevel[O]
  ): Monoid[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStructMonoid")(monoids.asInstanceOf[js.Any]).asInstanceOf[Monoid[O]]
  
  inline def getTupleMonoid[T /* <: js.Array[Monoid[js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param monoids because its type T is not an array type */ monoids: T
  ): Monoid[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Semigroup.Semigroup<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleMonoid & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleMonoid")(monoids.asInstanceOf[js.Any]).asInstanceOf[Monoid[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Semigroup.Semigroup<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleMonoid & TopLevel[T]
  ]]
  
  @JSImport("fp-ts", "monoid.monoidAll")
  @js.native
  val monoidAll: Monoid[Boolean] = js.native
  
  @JSImport("fp-ts", "monoid.monoidAny")
  @js.native
  val monoidAny: Monoid[Boolean] = js.native
  
  @JSImport("fp-ts", "monoid.monoidProduct")
  @js.native
  val monoidProduct: Monoid[Double] = js.native
  
  @JSImport("fp-ts", "monoid.monoidString")
  @js.native
  val monoidString: Monoid[String] = js.native
  
  @JSImport("fp-ts", "monoid.monoidSum")
  @js.native
  val monoidSum: Monoid[Double] = js.native
  
  @JSImport("fp-ts", "monoid.monoidVoid")
  @js.native
  val monoidVoid: Monoid[Unit] = js.native
}
