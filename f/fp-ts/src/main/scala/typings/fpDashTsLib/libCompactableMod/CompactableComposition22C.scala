package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactableComposition22C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG]
  extends fpDashTsLib.libFunctorMod.FunctorComposition22C[F, G, LG] {
  def compact[LF, A](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libOptionMod.Option[A]]]
  ): fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]]
  def separate[LF, A, B](
    fge: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): Separated[
    fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]], 
    fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, B]]
  ]
}

object CompactableComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type2[
        F, 
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libOptionMod.Option[js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type2[
        F, 
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[G, LG, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      Separated[
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]]
      ]
    ]
  ): CompactableComposition22C[F, G, LG] = {
    val __obj = js.Dynamic.literal(compact = compact, map = map, separate = separate)
  
    __obj.asInstanceOf[CompactableComposition22C[F, G, LG]]
  }
}

