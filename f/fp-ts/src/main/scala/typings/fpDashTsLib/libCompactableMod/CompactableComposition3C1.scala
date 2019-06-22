package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF]
  extends fpDashTsLib.libFunctorMod.FunctorComposition3C1[F, G, UF, LF] {
  def compact[A](
    fga: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]]
  def separate[A, B](
    fge: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, A]], 
    fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, B]]
  ]
}

object CompactableComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    compact: fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libOptionMod.Option[js.Any]]] => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]],
    separate: fpDashTsLib.libHKTMod.Kind3[
      F, 
      UF, 
      LF, 
      fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ] => Separated[
      fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]], 
      fpDashTsLib.libHKTMod.Kind3[F, UF, LF, fpDashTsLib.libHKTMod.Kind[G, js.Any]]
    ]
  ): CompactableComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), map = js.Any.fromFunction2(map), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[CompactableComposition3C1[F, G, UF, LF]]
  }
}

