package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "store")
@js.native
object storeNs extends js.Object {
  @js.native
  class Store[S, A] protected ()
    extends fpDashTsLib.libStoreMod.Store[S, A] {
    def this(peek: js.Function1[/* s */ S, A], pos: S) = this()
  }
  
  val URI: /* Store */ java.lang.String = js.native
  val peeks: js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[js.Any], 
    js.Function1[
      /* sa */ fpDashTsLib.libStoreMod.Store[js.Any, js.Any], 
      js.Function1[/* s */ js.Any, js.Any]
    ]
  ] = js.native
  val seeks: js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[js.Any], 
    js.Function1[
      /* sa */ fpDashTsLib.libStoreMod.Store[js.Any, js.Any], 
      fpDashTsLib.libStoreMod.Store[js.Any, js.Any]
    ]
  ] = js.native
  val store: fpDashTsLib.libComonadMod.Comonad2[fpDashTsLib.libStoreMod.URI] = js.native
  def experiment[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[/* sa */ fpDashTsLib.libStoreMod.Store[_, _], fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def experiment[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT2[F, _, _]], 
    js.Function1[/* sa */ fpDashTsLib.libStoreMod.Store[_, _], fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def experiment[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT3[F, _, _, _]], 
    js.Function1[
      /* sa */ fpDashTsLib.libStoreMod.Store[_, _], 
      fpDashTsLib.libHKTMod.Type3[F, _, _, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_FURIS[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[/* sa */ fpDashTsLib.libStoreMod.Store[_, _], fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
}

