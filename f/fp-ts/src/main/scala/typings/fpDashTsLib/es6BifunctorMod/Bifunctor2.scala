package typings
package fpDashTsLib.es6BifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  val URI: F
  def bimap[L, A, M, B](
    fla: fpDashTsLib.es6HKTMod.Kind2[F, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Kind2[F, M, B]
}

object Bifunctor2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    bimap: (fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, js.Any, js.Any]
  ): Bifunctor2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap))
  
    __obj.asInstanceOf[Bifunctor2[F]]
  }
}

