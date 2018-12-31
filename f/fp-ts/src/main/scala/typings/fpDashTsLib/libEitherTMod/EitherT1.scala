package typings
package fpDashTsLib.libEitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition12[F, fpDashTsLib.libEitherMod.URI] {
  def chain[L, A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[L, B]]],
    fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[L, A]]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[L, B]]
}

