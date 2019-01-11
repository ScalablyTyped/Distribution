package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Functor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flap[F](functor: fpDashTsLib.libFunctorMod.Functor[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.HKT[F, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS */](functor: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type[F, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS2 */](functor: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type2[F, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS3 */](functor: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type3[F, _, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](functor: fpDashTsLib.libFunctorMod.Functor2C[F, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def flap[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](functor: fpDashTsLib.libFunctorMod.Functor3C[F, U, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.libHKTMod.Type3[F, U, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F], G: fpDashTsLib.libFunctorMod.Functor1[G]): fpDashTsLib.libFunctorMod.FunctorComposition11[F, G] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor1[F], G: fpDashTsLib.libFunctorMod.Functor2[G]): fpDashTsLib.libFunctorMod.FunctorComposition12[F, G] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor2[F], G: fpDashTsLib.libFunctorMod.Functor1[G]): fpDashTsLib.libFunctorMod.FunctorComposition21[F, G] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F], G: fpDashTsLib.libFunctorMod.Functor2[G]): fpDashTsLib.libFunctorMod.FunctorComposition22[F, G] = js.native
  def getFunctorComposition[F, G](F: fpDashTsLib.libFunctorMod.Functor[F], G: fpDashTsLib.libFunctorMod.Functor[G]): fpDashTsLib.libFunctorMod.FunctorComposition[F, G] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](F: fpDashTsLib.libFunctorMod.Functor1[F], G: fpDashTsLib.libFunctorMod.Functor2C[G, LG]): fpDashTsLib.libFunctorMod.FunctorComposition12C[F, G, LG] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, LF](F: fpDashTsLib.libFunctorMod.Functor2C[F, LF], G: fpDashTsLib.libFunctorMod.Functor1[G]): fpDashTsLib.libFunctorMod.FunctorComposition2C1[F, G, LF] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](F: fpDashTsLib.libFunctorMod.Functor2[F], G: fpDashTsLib.libFunctorMod.Functor2C[G, LG]): fpDashTsLib.libFunctorMod.FunctorComposition22C[F, G, LG] = js.native
  def getFunctorComposition[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](F: fpDashTsLib.libFunctorMod.Functor3C[F, UF, LF], G: fpDashTsLib.libFunctorMod.Functor1[G]): fpDashTsLib.libFunctorMod.FunctorComposition3C1[F, G, UF, LF] = js.native
  def lift[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, _], fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
      fpDashTsLib.libHKTMod.Type2[F, _, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
      fpDashTsLib.libHKTMod.Type3[F, _, _, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFunctorMod.Functor2C[F, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
      fpDashTsLib.libHKTMod.Type2[F, L, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFunctorMod.Functor3C[F, U, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, _]
    ]
  ] = js.native
  def voidLeft[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFunctorMod.Functor2C[F, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def voidLeft[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFunctorMod.Functor3C[F, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def voidRight[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFunctorMod.Functor2C[F, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def voidRight[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFunctorMod.Functor3C[F, U, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
}

