package typings
package fpDashTsLib.libMonadTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadTask1[M /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libMonadMod.Monad1[M] {
  def fromTask[A](fa: fpDashTsLib.libTaskMod.Task[A]): fpDashTsLib.libHKTMod.Type[M, A]
}

object MonadTask1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: M,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type[M, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type[M, js.Any], 
      fpDashTsLib.libHKTMod.Type[M, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type[M, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]], 
      fpDashTsLib.libHKTMod.Type[M, js.Any]
    ],
    fromTask: js.Function1[fpDashTsLib.libTaskMod.Task[js.Any], fpDashTsLib.libHKTMod.Type[M, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[M, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[M, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]
  ): MonadTask1[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, fromTask = fromTask, map = map, of = of)
  
    __obj.asInstanceOf[MonadTask1[M]]
  }
}

