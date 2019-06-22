package typings
package fpDashTsLib.es6MonadThrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadThrow[M]
  extends fpDashTsLib.es6MonadMod.Monad[M] {
  /** @deprecated */
  def fromEither[E, A](e: fpDashTsLib.es6EitherMod.Either[E, A]): fpDashTsLib.es6HKTMod.HKT[M, A]
  /** @deprecated */
  def fromOption[E, A](o: fpDashTsLib.es6OptionMod.Option[A], e: E): fpDashTsLib.es6HKTMod.HKT[M, A]
  def throwError[E, A](e: E): fpDashTsLib.es6HKTMod.HKT[M, A]
}

object MonadThrow {
  @scala.inline
  def apply[M](
    URI: M,
    ap: (fpDashTsLib.es6HKTMod.HKT[M, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.HKT[M, js.Any]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    chain: (fpDashTsLib.es6HKTMod.HKT[M, js.Any], js.Function1[js.Any, fpDashTsLib.es6HKTMod.HKT[M, js.Any]]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    fromEither: fpDashTsLib.es6EitherMod.Either[js.Any, js.Any] => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    fromOption: (fpDashTsLib.es6OptionMod.Option[js.Any], js.Any) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[M, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.HKT[M, js.Any],
    throwError: js.Any => fpDashTsLib.es6HKTMod.HKT[M, js.Any]
  ): MonadThrow[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromEither = js.Any.fromFunction1(fromEither), fromOption = js.Any.fromFunction2(fromOption), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[MonadThrow[M]]
  }
}

