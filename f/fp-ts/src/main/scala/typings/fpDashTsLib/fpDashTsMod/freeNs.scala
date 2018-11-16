package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "free")
@js.native
object freeNs extends js.Object {
  @js.native
  class Impure[F, A, X] protected ()
    extends fpDashTsLib.libFreeMod.Impure[F, A, X] {
    def this(fx: fpDashTsLib.libHKTMod.HKT[F, X], f: js.Function1[/* x */ X, fpDashTsLib.libFreeMod.Free[F, A]]) = this()
  }
  
  @js.native
  class Pure[F, A] protected ()
    extends fpDashTsLib.libFreeMod.Pure[F, A] {
    def this(value: A) = this()
  }
  
  val URI: /* Free */ java.lang.String = js.native
  val liftF: js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[js.Any, js.Any], 
    fpDashTsLib.libFreeMod.Free[js.Any, js.Any]
  ] = js.native
  val of: js.Function1[/* a */ js.Any, fpDashTsLib.libFreeMod.Free[js.Any, js.Any]] = js.native
  def foldFree[M](M: fpDashTsLib.libMonadMod.Monad[M]): js.Function2[
    /* nt */ js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[_, _], fpDashTsLib.libHKTMod.HKT[M, _]], 
    /* fa */ fpDashTsLib.libFreeMod.Free[_, _], 
    fpDashTsLib.libHKTMod.HKT[M, _]
  ] = js.native
  def foldFree[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[M, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[M, _]
  ] = js.native
  def foldFree[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): fpDashTsLib.libFreeMod.FoldFree2[M] = js.native
  def foldFree[M /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonadMod.Monad3[M]): fpDashTsLib.libFreeMod.FoldFree3[M] = js.native
  def foldFree[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](M: fpDashTsLib.libMonadMod.Monad2C[M, L]): fpDashTsLib.libFreeMod.FoldFree2C[M, L] = js.native
  def foldFree[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](M: fpDashTsLib.libMonadMod.Monad3C[M, U, L]): fpDashTsLib.libFreeMod.FoldFree3C[M, U, L] = js.native
  def hoistFree[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS3 */](
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
      fpDashTsLib.libHKTMod.Type3[G, _, _, _]
    ]
  ): js.Function1[/* fa */ fpDashTsLib.libFreeMod.Free[F, _], fpDashTsLib.libFreeMod.Free[G, _]] = js.native
  @JSName("hoistFree")
  def hoistFree_FG[F, G](nt: js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[G, _]]): js.Function1[/* fa */ fpDashTsLib.libFreeMod.Free[F, _], fpDashTsLib.libFreeMod.Free[G, _]] = js.native
  @JSName("hoistFree")
  def hoistFree_FURIS2GURIS2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
      fpDashTsLib.libHKTMod.Type2[G, _, _]
    ]
  ): js.Function1[/* fa */ fpDashTsLib.libFreeMod.Free[F, _], fpDashTsLib.libFreeMod.Free[G, _]] = js.native
  @JSName("hoistFree")
  def hoistFree_FURISGURIS[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](nt: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, _], fpDashTsLib.libHKTMod.Type[G, _]]): js.Function1[/* fa */ fpDashTsLib.libFreeMod.Free[F, _], fpDashTsLib.libFreeMod.Free[G, _]] = js.native
}

