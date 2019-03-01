package typings
package fpDashTsLib.libCompactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compactable1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def compact[A](fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[A]]): fpDashTsLib.libHKTMod.Type[F, A]
  def separate[A, B](fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[A, B]]): Separated[fpDashTsLib.libHKTMod.Type[F, A], fpDashTsLib.libHKTMod.Type[F, B]]
}

object Compactable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    compact: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    separate: js.Function1[
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      Separated[fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]]
    ]
  ): Compactable1[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("separate")(separate)
    __obj.asInstanceOf[Compactable1[F]]
  }
}

