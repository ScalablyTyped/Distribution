package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctorWithIndex3[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I] extends PipeableFunctor3[F] {
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, A], 
    fpDashTsLib.libHKTMod.Kind3[F, _, _, B]
  ]
}

object PipeableFunctorWithIndex3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any]
    ],
    mapWithIndex: js.Function2[/* i */ I, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind3[F, _, _, js.Any]
    ]
  ): PipeableFunctorWithIndex3[F, I] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
  
    __obj.asInstanceOf[PipeableFunctorWithIndex3[F, I]]
  }
}

