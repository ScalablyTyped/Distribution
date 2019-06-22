package typings
package fpDashTsLib.libEitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT2v1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition12[F, fpDashTsLib.libEitherMod.URI] {
  def chain[L, A, B](
    fa: fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[L, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[L, B]]]
  ): fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[L, B]]
}

object EitherT2v1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    ap: (fpDashTsLib.libHKTMod.Kind[
      F, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.libEitherMod.URI, js.Any, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]],
    chain: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]]
  ): EitherT2v1[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[EitherT2v1[F]]
  }
}

