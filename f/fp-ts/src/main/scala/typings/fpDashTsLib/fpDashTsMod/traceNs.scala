package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "trace")
@js.native
object traceNs extends js.Object {
  val spy: js.Function1[/* a */ js.Any, js.Any] = js.native
  val trace: js.Function2[/* message */ js.Any, /* out */ fpDashTsLib.libFunctionMod.Lazy[js.Any], js.Any] = js.native
  def traceA[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[/* message */ js.Any, fpDashTsLib.libHKTMod.Type[F, scala.Unit]] = js.native
  def traceA[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[/* message */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, scala.Unit]] = js.native
  def traceA[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[/* message */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, scala.Unit]] = js.native
  def traceA[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function1[/* message */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, scala.Unit]] = js.native
  def traceA[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function1[/* message */ js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit]] = js.native
  def traceM[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libMonadMod.Monad1[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]] = js.native
  def traceM[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libMonadMod.Monad2[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]] = js.native
  def traceM[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libMonadMod.Monad3[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]] = js.native
  def traceM[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libMonadMod.Monad2C[F, L]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, _]] = js.native
  def traceM[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libMonadMod.Monad3C[F, U, L]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, _]] = js.native
}

