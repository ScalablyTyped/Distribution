package typings
package fpDashTsLib.libWitherableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wither2[W /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def apply[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[W, _, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.Type2[W, _, _]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[W, _, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type2[W, _, _]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[W, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[W, _, _]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[W, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type2[W, _, _]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[W, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[F, FL, fpDashTsLib.libHKTMod.Type2[W, _, _]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, FU, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[W, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, FU, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[F, FU, FL, fpDashTsLib.libHKTMod.Type2[W, _, _]]
  ] = js.native
}

