package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Contravariant", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def lift[F](contravariant: fpDashTsLib.libContravariantMod.Contravariant[F]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS */](contravariant: fpDashTsLib.libContravariantMod.Contravariant1[F]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[F, _], fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS2 */](contravariant: fpDashTsLib.libContravariantMod.Contravariant2[F]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
      fpDashTsLib.libHKTMod.Type2[F, _, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS3 */](contravariant: fpDashTsLib.libContravariantMod.Contravariant3[F]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
      fpDashTsLib.libHKTMod.Type3[F, _, _, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](contravariant: fpDashTsLib.libContravariantMod.Contravariant2C[F, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
      fpDashTsLib.libHKTMod.Type2[F, L, _]
    ]
  ] = js.native
  def lift[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](contravariant: fpDashTsLib.libContravariantMod.Contravariant3C[F, U, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, _]
    ]
  ] = js.native
}

