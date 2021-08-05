package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.contravariantMod.Contravariant1
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.ordMod.Ord_
import typings.fpTs.orderingMod.Ordering
import typings.fpTs.semigroupMod.Semigroup
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ord {
  
  @JSImport("fp-ts", "ord")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "ord.Contravariant")
  @js.native
  val Contravariant: Contravariant1[typings.fpTs.ordMod.URI] = js.native
  
  @JSImport("fp-ts", "ord.URI")
  @js.native
  val URI: /* "Ord" */ String = js.native
  
  inline def between[A](O: Ord_[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, Boolean]]]
  
  inline def clamp[A](O: Ord_[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, A]]]
  
  inline def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Ord_[A], Ord_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Ord_[A], Ord_[B]]]
  
  inline def fromCompare[A](compare: js.Function2[/* x */ A, /* y */ A, Ordering]): Ord_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompare")(compare.asInstanceOf[js.Any]).asInstanceOf[Ord_[A]]
  
  inline def geq[A](O: Ord_[A]): js.Function2[/* x */ A, /* y */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("geq")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ A, /* y */ A, Boolean]]
  
  inline def getDualOrd[A](O: Ord_[A]): Ord_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDualOrd")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[A]]
  
  inline def getMonoid[A](): Monoid[Ord_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[Ord_[A]]]
  
  inline def getSemigroup[A](): Semigroup[Ord_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[Ord_[A]]]
  
  inline def getTupleOrd[T /* <: js.Array[Ord_[js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ords because its type T is not an array type */ ords: T
  ): Ord_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ord.Ord<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleOrd & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTupleOrd")(ords.asInstanceOf[js.Any]).asInstanceOf[Ord_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ord.Ord<infer A>? any : never}
    */ typings.fpTs.fpTsStrings.getTupleOrd & TopLevel[T]
  ]]
  
  inline def gt[A](O: Ord_[A]): js.Function2[/* x */ A, /* y */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("gt")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ A, /* y */ A, Boolean]]
  
  inline def leq[A](O: Ord_[A]): js.Function2[/* x */ A, /* y */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("leq")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ A, /* y */ A, Boolean]]
  
  inline def lt[A](O: Ord_[A]): js.Function2[/* x */ A, /* y */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("lt")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ A, /* y */ A, Boolean]]
  
  inline def max[A](O: Ord_[A]): js.Function2[/* x */ A, /* y */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ A, /* y */ A, A]]
  
  inline def min[A](O: Ord_[A]): js.Function2[/* x */ A, /* y */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ A, /* y */ A, A]]
  
  @JSImport("fp-ts", "ord.ord")
  @js.native
  val ord: Contravariant1[typings.fpTs.ordMod.URI] = js.native
  
  @JSImport("fp-ts", "ord.ordBoolean")
  @js.native
  val ordBoolean: Ord_[Boolean] = js.native
  
  @JSImport("fp-ts", "ord.ordDate")
  @js.native
  val ordDate: Ord_[Date] = js.native
  
  @JSImport("fp-ts", "ord.ordNumber")
  @js.native
  val ordNumber: Ord_[Double] = js.native
  
  @JSImport("fp-ts", "ord.ordString")
  @js.native
  val ordString: Ord_[String] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
