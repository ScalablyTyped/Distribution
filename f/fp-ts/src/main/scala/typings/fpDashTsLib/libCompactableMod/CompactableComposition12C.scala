package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition12C[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG]
  extends fpDashTsLib.libFunctorMod.FunctorComposition12C[F, G, LG] {
  def compact[A](
    fga: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]]
  def separate[A, B](
    fge: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, A]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, B]]
  ]
}

object CompactableComposition12C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libOptionMod.Option[js.Any]]], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type[
        F, 
        fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      Separated[
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]]
      ]
    ]
  ): CompactableComposition12C[F, G, LG] = {
    val __obj = js.Dynamic.literal(compact = compact, map = map, separate = separate)
  
    __obj.asInstanceOf[CompactableComposition12C[F, G, LG]]
  }
}

