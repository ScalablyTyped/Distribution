package typings
package fpDashTsLib.libEitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition22[F, fpDashTsLib.libEitherMod.URI] {
  def chain[L, M, A, B](
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, B]]
    ],
    fa: fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, A]]
  ): fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, B]]
}

