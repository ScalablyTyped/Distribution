package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def compact[U, L, A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def separate[U, L, A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, B]]
}

object Compactable3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      Separated[
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
        fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
      ]
    ]
  ): Compactable3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("separate")(separate)
    __obj.asInstanceOf[Compactable3[F]]
  }
}

