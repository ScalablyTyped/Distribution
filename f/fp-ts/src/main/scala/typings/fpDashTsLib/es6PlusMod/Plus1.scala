package typings
package fpDashTsLib.es6PlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus1[F /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6AltMod.Alt1[F] {
  def zero[A](): fpDashTsLib.es6HKTMod.Kind[F, A]
}

object Plus1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    alt: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], fpDashTsLib.es6HKTMod.Kind[F, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any],
    zero: () => fpDashTsLib.es6HKTMod.Kind[F, js.Any]
  ): Plus1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Plus1[F]]
  }
}

