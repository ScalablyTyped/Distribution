package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.FunctorComposition11[F, G] {
  def compact[A](
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]]
  def separate[A, B](
    fge: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, B]]
  ]
}

object CompactableComposition11 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libOptionMod.Option[js.Any]]], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]], 
      Separated[
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, js.Any]]
      ]
    ]
  ): CompactableComposition11[F, G] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("separate")(separate)
    __obj.asInstanceOf[CompactableComposition11[F, G]]
  }
}

