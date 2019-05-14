package typings
package fpDashTsLib.es6EitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6ApplicativeMod.ApplicativeComposition12[F, fpDashTsLib.es6EitherMod.URI] {
  def chain[L, A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6EitherMod.Either[L, B]]],
    fa: fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6EitherMod.Either[L, A]]
  ): fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6EitherMod.Either[L, B]]
}

object EitherT1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    ap: (fpDashTsLib.es6HKTMod.Type[
      F, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]],
    chain: (js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ], fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.es6EitherMod.URI, js.Any, js.Any]]
  ): EitherT1[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[EitherT1[F]]
  }
}

