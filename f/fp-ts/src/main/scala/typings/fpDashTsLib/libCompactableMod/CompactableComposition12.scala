package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition12[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition12[F, G] {
  def compact[LG, A](
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]]
  def separate[LG, A, B](
    fge: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, B]]
  ]
}

object CompactableComposition12 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type[
        F, 
        fpDashTsLib.libHKTMod.Type2[G, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      Separated[
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]], 
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, js.Any, js.Any]]
      ]
    ]
  ): CompactableComposition12[F, G] = {
    val __obj = js.Dynamic.literal(compact = compact, map = map, separate = separate)
  
    __obj.asInstanceOf[CompactableComposition12[F, G]]
  }
}

