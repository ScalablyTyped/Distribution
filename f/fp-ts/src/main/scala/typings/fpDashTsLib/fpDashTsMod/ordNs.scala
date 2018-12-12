package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ord")
@js.native
object ordNs extends js.Object {
  val ordBoolean: fpDashTsLib.libOrdMod.Ord[scala.Boolean] = js.native
  val ordDate: fpDashTsLib.libOrdMod.Ord[stdLib.Date] = js.native
  val ordNumber: fpDashTsLib.libOrdMod.Ord[scala.Double] = js.native
  val ordString: fpDashTsLib.libOrdMod.Ord[java.lang.String] = js.native
  def between[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, scala.Boolean]] = js.native
  def clamp[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[/* low */ A, /* hi */ A, js.Function1[/* x */ A, A]] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A], fa: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[B] = js.native
  def fromCompare[A](compare: js.Function2[/* x */ A, /* y */ A, fpDashTsLib.libOrderingMod.Ordering]): fpDashTsLib.libOrdMod.Ord[A] = js.native
  def getDualOrd[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[A] = js.native
  def getProductOrd[A, B](OA: fpDashTsLib.libOrdMod.Ord[A], OB: fpDashTsLib.libOrdMod.Ord[B]): fpDashTsLib.libOrdMod.Ord[js.Tuple2[A, B]] = js.native
  def getSemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libOrdMod.Ord[A]] = js.native
  def greaterThan[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def greaterThanOrEq[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def lessThan[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def lessThanOrEq[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, scala.Boolean] = js.native
  def max[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
  def min[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
  def unsafeCompare(x: js.Any, y: js.Any): fpDashTsLib.libOrderingMod.Ordering = js.native
}

