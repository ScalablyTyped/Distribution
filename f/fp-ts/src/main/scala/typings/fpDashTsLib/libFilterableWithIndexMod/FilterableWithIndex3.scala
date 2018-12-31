package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I]
  extends fpDashTsLib.libFilterableMod.Filterable3[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex3[F, I] {
  /* InferMemberOverrides */
  override val URI: F
  def filterMapWithIndex[U, L, A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
  def filterWithIndex[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def partitionMapWithIndex[RL, RR, U, L, A](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, RL], fpDashTsLib.libHKTMod.Type3[F, U, L, RR]]
  def partitionWithIndex[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, A]]
}

