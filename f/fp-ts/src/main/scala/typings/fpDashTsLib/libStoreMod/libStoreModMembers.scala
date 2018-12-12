package typings
package fpDashTsLib.libStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Store", JSImport.Namespace)
@js.native
object libStoreModMembers extends js.Object {
  val URI: /* Store */ java.lang.String = js.native
  val store: fpDashTsLib.libComonadMod.Comonad2[URI] = js.native
  def experiment[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[/* sa */ Store[_, _], fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def experiment[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT2[F, _, _]], 
    js.Function1[/* sa */ Store[_, _], fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def experiment[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT3[F, _, _, _]], 
    js.Function1[/* sa */ Store[_, _], fpDashTsLib.libHKTMod.Type3[F, _, _, _]]
  ] = js.native
  @JSName("experiment")
  def experiment_FURIS[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[/* sa */ Store[_, _], fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def peeks[S](f: fpDashTsLib.libFunctionMod.Endomorphism[S]): js.Function1[/* sa */ Store[S, _], js.Function1[/* s */ S, _]] = js.native
  def seeks[S](f: fpDashTsLib.libFunctionMod.Endomorphism[S]): js.Function1[/* sa */ Store[S, _], Store[S, _]] = js.native
}

