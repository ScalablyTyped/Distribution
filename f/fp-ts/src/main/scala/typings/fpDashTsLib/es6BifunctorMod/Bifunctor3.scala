package typings
package fpDashTsLib.es6BifunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bifunctor3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  val URI: F
  def bimap[U, L, A, M, B](
    fla: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A],
    f: js.Function1[/* l */ L, M],
    g: js.Function1[/* a */ A, B]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, M, B]
}

object Bifunctor3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    bimap: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Bifunctor3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap))
  
    __obj.asInstanceOf[Bifunctor3[F]]
  }
}

