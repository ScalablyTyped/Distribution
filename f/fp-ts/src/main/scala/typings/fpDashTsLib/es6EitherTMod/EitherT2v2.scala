package typings
package fpDashTsLib.es6EitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT2v2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ApplicativeMod.ApplicativeComposition22[F, fpDashTsLib.es6EitherMod.URI] {
  def chain[L, M, A, B](
    fa: fpDashTsLib.es6HKTMod.Type2[F, M, fpDashTsLib.es6EitherMod.Either[L, A]],
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.es6HKTMod.Type2[F, M, fpDashTsLib.es6EitherMod.Either[L, B]]
    ]
  ): fpDashTsLib.es6HKTMod.Type2[F, M, fpDashTsLib.es6EitherMod.Either[L, B]]
}

object EitherT2v2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    ap: (fpDashTsLib.es6HKTMod.Type2[
      F, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]],
    chain: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]], js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Type2[F, js.Any, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]]
  ): EitherT2v2[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[EitherT2v2[F]]
  }
}

