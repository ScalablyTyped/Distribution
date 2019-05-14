package typings
package fpDashTsLib.es6BifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor[F] extends js.Object {
  val URI: F
  def bimap[L, A, M, B](
    fla: fpDashTsLib.es6HKTMod.HKT2[F, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.es6HKTMod.HKT2[F, M, B]
}

object Bifunctor {
  @scala.inline
  def apply[F](
    URI: F,
    bimap: (fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT2[F, js.Any, js.Any]
  ): Bifunctor[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap))
  
    __obj.asInstanceOf[Bifunctor[F]]
  }
}

