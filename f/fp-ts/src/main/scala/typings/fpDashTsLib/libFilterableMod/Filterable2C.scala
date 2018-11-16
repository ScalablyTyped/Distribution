package typings
package fpDashTsLib.libFilterableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Filterable2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L]
     with fpDashTsLib.libCompactableMod.Compactable2C[F, L] {
  /* InferMemberOverrides */
  override val URI: F
  /* InferMemberOverrides */
  override val _L: L
  def filter[A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libHKTMod.Type2[F, L, A]
  def filterMap[A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
  def partition[A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, A]]
  def partitionMap[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, RL], fpDashTsLib.libHKTMod.Type2[F, L, RR]]
}

