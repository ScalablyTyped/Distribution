package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Functor", JSImport.Namespace)
@js.native
object libFunctorModMembers extends js.Object {
  def flap[F](functor: Functor[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.HKT[F, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS */](functor: Functor1[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type[F, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS2 */](functor: Functor2[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type2[F, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS3 */](functor: Functor3[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type3[F, _, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](functor: Functor2C[F, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](functor: Functor3C[F, U, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type3[F, U, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: Functor1[F], G: Functor1[G]): FunctorComposition11[F, G] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Functor1[F], G: Functor2[G]): FunctorComposition12[F, G] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: Functor2[F], G: Functor1[G]): FunctorComposition21[F, G] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Functor2[F], G: Functor2[G]): FunctorComposition22[F, G] = js.native
  def getFunctorComposition[F, G](F: Functor[F], G: Functor[G]): FunctorComposition[F, G] = js.native
  def lift[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, _], fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
      fpDashTsLib.libHKTMod.Type2[F, _, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
      fpDashTsLib.libHKTMod.Type3[F, _, _, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Functor2C[F, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
      fpDashTsLib.libHKTMod.Type2[F, L, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Functor3C[F, U, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, _]
    ]
  ] = js.native
  def voidLeft[F](F: Functor[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Functor1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Functor2[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Functor3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Functor2C[F, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Functor3C[F, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def voidRight[F](F: Functor[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Functor1[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Functor2[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Functor3[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Functor2C[F, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Functor3C[F, U, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
}

