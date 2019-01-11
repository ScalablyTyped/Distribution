package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Monoidal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromApplicative[F](applicative: fpDashTsLib.libApplicativeMod.Applicative[F]): fpDashTsLib.libMonoidalMod.Monoidal[F] = js.native
  def fromApplicative[F /* <: fpDashTsLib.libHKTMod.URIS */](applicative: fpDashTsLib.libApplicativeMod.Applicative1[F]): fpDashTsLib.libMonoidalMod.Monoidal1[F] = js.native
  def fromApplicative[F /* <: fpDashTsLib.libHKTMod.URIS2 */](applicative: fpDashTsLib.libApplicativeMod.Applicative2[F]): fpDashTsLib.libMonoidalMod.Monoidal2[F] = js.native
  def fromApplicative[F /* <: fpDashTsLib.libHKTMod.URIS3 */](applicative: fpDashTsLib.libApplicativeMod.Applicative3[F]): fpDashTsLib.libMonoidalMod.Monoidal3[F] = js.native
  def toApplicative[F](monoidal: fpDashTsLib.libMonoidalMod.Monoidal[F]): fpDashTsLib.libApplicativeMod.Applicative[F] = js.native
  def toApplicative[F /* <: fpDashTsLib.libHKTMod.URIS */](monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[F]): fpDashTsLib.libApplicativeMod.Applicative1[F] = js.native
  def toApplicative[F /* <: fpDashTsLib.libHKTMod.URIS2 */](monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[F]): fpDashTsLib.libApplicativeMod.Applicative2[F] = js.native
  def toApplicative[F /* <: fpDashTsLib.libHKTMod.URIS3 */](monoidal: fpDashTsLib.libMonoidalMod.Monoidal3[F]): fpDashTsLib.libApplicativeMod.Applicative3[F] = js.native
}

