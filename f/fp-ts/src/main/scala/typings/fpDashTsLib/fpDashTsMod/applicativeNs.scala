package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "applicative")
@js.native
object applicativeNs extends js.Object {
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F], G: fpDashTsLib.libApplicativeMod.Applicative1[G]): fpDashTsLib.libApplicativeMod.ApplicativeComposition11[F, G] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative1[F], G: fpDashTsLib.libApplicativeMod.Applicative2[G]): fpDashTsLib.libApplicativeMod.ApplicativeComposition12[F, G] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative2[F], G: fpDashTsLib.libApplicativeMod.Applicative1[G]): fpDashTsLib.libApplicativeMod.ApplicativeComposition21[F, G] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F], G: fpDashTsLib.libApplicativeMod.Applicative2[G]): fpDashTsLib.libApplicativeMod.ApplicativeComposition22[F, G] = js.native
  def getApplicativeComposition[F, G](F: fpDashTsLib.libApplicativeMod.Applicative[F], G: fpDashTsLib.libApplicativeMod.Applicative[G]): fpDashTsLib.libApplicativeMod.ApplicativeComposition[F, G] = js.native
  def getApplicativeComposition[F, G /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative[F], G: fpDashTsLib.libApplicativeMod.Applicative1[G]): fpDashTsLib.libApplicativeMod.ApplicativeComposition[F, G] = js.native
  def getApplicativeComposition[F, G /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative[F], G: fpDashTsLib.libApplicativeMod.Applicative2[G]): fpDashTsLib.libApplicativeMod.ApplicativeComposition[F, G] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    F: fpDashTsLib.libApplicativeMod.Applicative1[F],
    G: fpDashTsLib.libApplicativeMod.Applicative2C[G, L]
  ): fpDashTsLib.libApplicativeMod.ApplicativeComposition12C[F, G, L] = js.native
  def getApplicativeComposition[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    F: fpDashTsLib.libApplicativeMod.Applicative2[F],
    G: fpDashTsLib.libApplicativeMod.Applicative2C[G, L]
  ): fpDashTsLib.libApplicativeMod.ApplicativeComposition22C[F, G, L] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS */, A](F: fpDashTsLib.libApplicativeMod.Applicative1[F], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type[F, A]]] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS2 */, A](F: fpDashTsLib.libApplicativeMod.Applicative2[F], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type2[F, _, A]]] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS3 */, A](F: fpDashTsLib.libApplicativeMod.Applicative3[F], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type3[F, _, _, A]]] = js.native
  def getMonoid[F, A](F: fpDashTsLib.libApplicativeMod.Applicative[F], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.HKT[F, A]]] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L, A](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type2[F, L, A]]] = js.native
  def getMonoid[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L, A](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L], M: fpDashTsLib.libMonoidMod.Monoid[A]): js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libHKTMod.Type3[F, U, L, A]]] = js.native
  def when[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.HKT[F, scala.Unit], 
    fpDashTsLib.libHKTMod.HKT[F, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type[F, scala.Unit], 
    fpDashTsLib.libHKTMod.Type[F, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type2[F, _, scala.Unit], 
    fpDashTsLib.libHKTMod.Type2[F, _, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type3[F, _, _, scala.Unit], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type2[F, L, scala.Unit], 
    fpDashTsLib.libHKTMod.Type2[F, L, scala.Unit]
  ] = js.native
  def when[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function2[
    /* condition */ scala.Boolean, 
    /* fu */ fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, scala.Unit]
  ] = js.native
}

