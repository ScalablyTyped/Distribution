package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Filterable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F]
     with fpDashTsLib.libCompactableMod.Compactable3[F] {
  /* InferMemberOverrides */
  override val URI: F
  def filter[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def filterMap[U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
  def partition[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, A]]
  def partitionMap[RL, RR, U, L, A](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, RL], fpDashTsLib.libHKTMod.Type3[F, U, L, RR]]
}

