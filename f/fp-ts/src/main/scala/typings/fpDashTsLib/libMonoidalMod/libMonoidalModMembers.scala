package typings
package fpDashTsLib.libMonoidalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Monoidal", JSImport.Namespace)
@js.native
object libMonoidalModMembers extends js.Object {
  def fromApplicative[F](applicative: fpDashTsLib.libApplicativeMod.Applicative[F]): Monoidal[F] = js.native
  def fromApplicative[F /* <: fpDashTsLib.libHKTMod.URIS */](applicative: fpDashTsLib.libApplicativeMod.Applicative1[F]): Monoidal1[F] = js.native
  def fromApplicative[F /* <: fpDashTsLib.libHKTMod.URIS2 */](applicative: fpDashTsLib.libApplicativeMod.Applicative2[F]): Monoidal2[F] = js.native
  def fromApplicative[F /* <: fpDashTsLib.libHKTMod.URIS3 */](applicative: fpDashTsLib.libApplicativeMod.Applicative3[F]): Monoidal3[F] = js.native
  def toApplicative[F](monoidal: Monoidal[F]): fpDashTsLib.libApplicativeMod.Applicative[F] = js.native
  def toApplicative[F /* <: fpDashTsLib.libHKTMod.URIS */](monoidal: Monoidal1[F]): fpDashTsLib.libApplicativeMod.Applicative1[F] = js.native
  def toApplicative[F /* <: fpDashTsLib.libHKTMod.URIS2 */](monoidal: Monoidal2[F]): fpDashTsLib.libApplicativeMod.Applicative2[F] = js.native
  def toApplicative[F /* <: fpDashTsLib.libHKTMod.URIS3 */](monoidal: Monoidal3[F]): fpDashTsLib.libApplicativeMod.Applicative3[F] = js.native
}

