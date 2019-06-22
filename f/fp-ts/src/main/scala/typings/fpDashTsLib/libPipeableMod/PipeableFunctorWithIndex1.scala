package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctorWithIndex1[F /* <: fpDashTsLib.libHKTMod.URIS */, I] extends PipeableFunctor1[F] {
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, A], fpDashTsLib.libHKTMod.Kind[F, B]]
}

object PipeableFunctorWithIndex1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, I](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ],
    mapWithIndex: js.Function2[/* i */ I, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], 
      fpDashTsLib.libHKTMod.Kind[F, js.Any]
    ]
  ): PipeableFunctorWithIndex1[F, I] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
  
    __obj.asInstanceOf[PipeableFunctorWithIndex1[F, I]]
  }
}

