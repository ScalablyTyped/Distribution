package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipeableFunctorWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I] extends PipeableFunctor2[F] {
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libHKTMod.Kind2[F, _, B]
  ]
}

object PipeableFunctorWithIndex2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, _, js.Any]
    ],
    mapWithIndex: js.Function2[/* i */ I, js.Any, js.Any] => js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, js.Any], 
      fpDashTsLib.libHKTMod.Kind2[F, _, js.Any]
    ]
  ): PipeableFunctorWithIndex2[F, I] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
  
    __obj.asInstanceOf[PipeableFunctorWithIndex2[F, I]]
  }
}

