package typings
package fpDashTsLib.es6EitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT2v[F]
  extends fpDashTsLib.es6ApplicativeMod.ApplicativeComposition[F, fpDashTsLib.es6EitherMod.URI] {
  def chain[L, A, B](
    fa: fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[L, A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[L, B]]]
  ): fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[L, B]]
}

object EitherT2v {
  @scala.inline
  def apply[F](
    ap: (fpDashTsLib.es6HKTMod.HKT[
      F, 
      fpDashTsLib.es6HKTMod.HKT[fpDashTsLib.es6EitherMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[fpDashTsLib.es6EitherMod.URI, js.Any]]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[fpDashTsLib.es6EitherMod.URI, js.Any]],
    chain: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]], js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[js.Any, js.Any]],
    map: (fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[fpDashTsLib.es6EitherMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[fpDashTsLib.es6EitherMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[fpDashTsLib.es6EitherMod.URI, js.Any]]
  ): EitherT2v[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[EitherT2v[F]]
  }
}

