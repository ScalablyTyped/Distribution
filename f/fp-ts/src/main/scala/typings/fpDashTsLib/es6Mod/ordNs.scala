package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "ord")
@js.native
object ordNs extends js.Object {
  val ordBoolean: fpDashTsLib.es6OrdMod.Ord[scala.Boolean] = js.native
  val ordDate: fpDashTsLib.es6OrdMod.Ord[stdLib.Date] = js.native
  val ordNumber: fpDashTsLib.es6OrdMod.Ord[scala.Double] = js.native
  val ordString: fpDashTsLib.es6OrdMod.Ord[java.lang.String] = js.native
  def between[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, scala.Boolean]] = js.native
  def clamp[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, A]] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A], fa: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[B] = js.native
  def fromCompare[A](compare: js.Function2[/* x */ A, /* y */ A, fpDashTsLib.es6OrderingMod.Ordering]): fpDashTsLib.es6OrdMod.Ord[A] = js.native
  def getDualOrd[A](O: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[A] = js.native
  def getProductOrd[A, B](OA: fpDashTsLib.es6OrdMod.Ord[A], OB: fpDashTsLib.es6OrdMod.Ord[B]): fpDashTsLib.es6OrdMod.Ord[js.Tuple2[A, B]] = js.native
  def getSemigroup[A](): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6OrdMod.Ord[A]] = js.native
  def getTupleOrd[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6OrdMod.Ord[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param ords because its type T is not an array type */ ords: T
  ): fpDashTsLib.es6OrdMod.Ord[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Ord.Ord<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleOrd with T
  ] = js.native
  def greaterThan[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def greaterThanOrEq[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def lessThan[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def lessThanOrEq[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def max[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
  def min[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
  def unsafeCompare(x: js.Any, y: js.Any): fpDashTsLib.es6OrderingMod.Ordering = js.native
}

