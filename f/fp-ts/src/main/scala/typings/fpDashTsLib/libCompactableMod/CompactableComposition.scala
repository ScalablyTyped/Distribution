package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition[F, G]
  extends fpDashTsLib.libFunctorMod.FunctorComposition[F, G] {
  def compact[A](
    fga: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, A]]
  def separate[A, B](
    fge: fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, A]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, B]]
  ]
}

object CompactableComposition {
  @scala.inline
  def apply[F, G](
    compact: js.Function1[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, fpDashTsLib.libOptionMod.Option[js.Any]]], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]], 
      Separated[
        fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], 
        fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]]
      ]
    ]
  ): CompactableComposition[F, G] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("separate")(separate)
    __obj.asInstanceOf[CompactableComposition[F, G]]
  }
}

