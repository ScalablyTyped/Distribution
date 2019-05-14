package typings
package fpDashTsLib.es6ApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative[F]
  extends fpDashTsLib.es6ApplyMod.Apply[F] {
  def of[A](a: A): fpDashTsLib.es6HKTMod.HKT[F, A]
}

object Applicative {
  @scala.inline
  def apply[F](
    URI: F,
    ap: (fpDashTsLib.es6HKTMod.HKT[F, js.Function1[js.Any, js.Any]], fpDashTsLib.es6HKTMod.HKT[F, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any],
    of: js.Any => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Applicative[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Applicative[F]]
  }
}

