package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctorComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def map[A, B](fa: fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, A]], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type[G, B]]
}

