package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I]
  extends fpDashTsLib.libFilterableMod.Filterable2[F]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex2[F, I] {
  /* InferMemberOverrides */
  override val URI: F
  def filterMapWithIndex[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
  def filterWithIndex[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.Type2[F, L, A]
  def partitionMapWithIndex[RL, RR, L, A](
    fa: fpDashTsLib.libHKTMod.Type2[F, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, RL], fpDashTsLib.libHKTMod.Type2[F, L, RR]]
  def partitionWithIndex[L, A](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[F, L, A], fpDashTsLib.libHKTMod.Type2[F, L, A]]
}

