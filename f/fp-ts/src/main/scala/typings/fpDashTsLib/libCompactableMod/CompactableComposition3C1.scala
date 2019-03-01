package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition3C1[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF]
  extends fpDashTsLib.libFunctorMod.FunctorComposition3C1[F, G, UF, LF] {
  def compact[A](
    fga: fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, A]]
  def separate[A, B](
    fge: fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, A]], 
    fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, B]]
  ]
}

object CompactableComposition3C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libOptionMod.Option[js.Any]]], 
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type3[
        F, 
        UF, 
        LF, 
        fpDashTsLib.libHKTMod.Type[G, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      Separated[
        fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
        fpDashTsLib.libHKTMod.Type3[F, UF, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]]
      ]
    ]
  ): CompactableComposition3C1[F, G, UF, LF] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("separate")(separate)
    __obj.asInstanceOf[CompactableComposition3C1[F, G, UF, LF]]
  }
}

