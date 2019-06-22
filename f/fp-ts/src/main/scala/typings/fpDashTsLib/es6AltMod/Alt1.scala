package typings
package fpDashTsLib.es6AltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FunctorMod.Functor1[F] {
  def alt[A](fx: fpDashTsLib.es6HKTMod.Kind[F, A], fy: fpDashTsLib.es6HKTMod.Kind[F, A]): fpDashTsLib.es6HKTMod.Kind[F, A]
}

object Alt1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], fpDashTsLib.es6HKTMod.Kind[F, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any]
  ): Alt1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt1[F]]
  }
}

