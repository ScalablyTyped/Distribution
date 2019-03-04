package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def map[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Type[F, B]
}

object Functor1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ]
  ): Functor1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = map)
  
    __obj.asInstanceOf[Functor1[F]]
  }
}

