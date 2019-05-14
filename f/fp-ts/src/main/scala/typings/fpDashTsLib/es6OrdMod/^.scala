package typings
package fpDashTsLib.es6OrdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Ord", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ordBoolean: Ord[scala.Boolean] = js.native
  val ordDate: Ord[stdLib.Date] = js.native
  val ordNumber: Ord[scala.Double] = js.native
  val ordString: Ord[java.lang.String] = js.native
  def between[A](O: Ord[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, scala.Boolean]] = js.native
  def clamp[A](O: Ord[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, A]] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A], fa: Ord[A]): Ord[B] = js.native
  def fromCompare[A](compare: js.Function2[/* x */ A, /* y */ A, fpDashTsLib.es6OrderingMod.Ordering]): Ord[A] = js.native
  def getDualOrd[A](O: Ord[A]): Ord[A] = js.native
  def getProductOrd[A, B](OA: Ord[A], OB: Ord[B]): Ord[js.Tuple2[A, B]] = js.native
  def getSemigroup[A](): fpDashTsLib.es6SemigroupMod.Semigroup[Ord[A]] = js.native
  def getTupleOrd[T /* <: fpDashTsLib.libArrayMod.Global.Array[Ord[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param ords because its type T is not an array type */ ords: T
  ): Ord[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Ord.Ord<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleOrd with T
  ] = js.native
  def greaterThan[A](O: Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def greaterThanOrEq[A](O: Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def lessThan[A](O: Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def lessThanOrEq[A](O: Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def max[A](O: Ord[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
  def min[A](O: Ord[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
  def unsafeCompare(x: js.Any, y: js.Any): fpDashTsLib.es6OrderingMod.Ordering = js.native
}

