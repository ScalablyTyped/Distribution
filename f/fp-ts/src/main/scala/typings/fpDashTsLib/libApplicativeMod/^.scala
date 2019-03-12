package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Applicative", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: Applicative1[F], G: Applicative1[G]): ApplicativeComposition11[F, G] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Applicative1[F], G: Applicative2[G]): ApplicativeComposition12[F, G] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: Applicative2[F], G: Applicative1[G]): ApplicativeComposition21[F, G] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Applicative2[F], G: Applicative2[G]): ApplicativeComposition22[F, G] = js.native
  def getApplicativeComposition[F, G](F: Applicative[F], G: Applicative[G]): ApplicativeComposition[F, G] = js.native
  def getApplicativeComposition[F, G /* <: fpDashTsLib.libHKTMod.URIS */](F: Applicative[F], G: Applicative1[G]): ApplicativeComposition[F, G] = js.native
  def getApplicativeComposition[F, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Applicative[F], G: Applicative2[G]): ApplicativeComposition[F, G] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](F: Applicative1[F], G: Applicative2C[G, LG]): ApplicativeComposition12C[F, G, LG] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, LG](F: Applicative2[F], G: Applicative2C[G, LG]): ApplicativeComposition22C[F, G, LG] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS3 */, G /* <: fpDashTsLib.libHKTMod.URIS */, UF, LF](F: Applicative3C[F, UF, LF], G: Applicative1[G]): ApplicativeComposition3C1[F, G, UF, LF] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: Applicative1[F], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type[F, A]]] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: Applicative2[F], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type2[F, _, A]]] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: Applicative3[F], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type3[F, _, _, A]]] = js.native
  def getMonoid[F, A](F: Applicative[F], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.HKT[F, A]]] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L, A](F: Applicative2C[F, L], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type2[F, L, A]]] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L, A](F: Applicative3C[F, U, L], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type3[F, U, L, A]]] = js.native
  def when[F](F: Applicative[F]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.HKT[F, scala.Unit], 
    fpDashTsLib.libHKTMod.HKT[F, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS */](F: Applicative1[F]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type[F, scala.Unit], 
    fpDashTsLib.libHKTMod.Type[F, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: Applicative2[F]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type2[F, _, scala.Unit], 
    fpDashTsLib.libHKTMod.Type2[F, _, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: Applicative3[F]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type3[F, _, _, scala.Unit], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: Applicative2C[F, L]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type2[F, L, scala.Unit], 
    fpDashTsLib.libHKTMod.Type2[F, L, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: Applicative3C[F, U, L]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit]
  ] = js.native
}

