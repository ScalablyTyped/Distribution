package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctorWithIndex4[F /* <: fpDashTsLib.libHKTMod.URIS4 */, I] extends PipeableFunctor4[F] {
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, A], 
    fpDashTsLib.libHKTMod.Kind4[F, _, _, _, B]
  ]
}

object PipeableFunctorWithIndex4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */, I](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any]
    ],
    mapWithIndex: js.Function2[/* i */ I, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind4[F, _, _, _, js.Any]
    ]
  ): PipeableFunctorWithIndex4[F, I] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
  
    __obj.asInstanceOf[PipeableFunctorWithIndex4[F, I]]
  }
}

