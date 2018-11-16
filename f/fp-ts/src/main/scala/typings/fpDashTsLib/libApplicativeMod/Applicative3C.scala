package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Applicative3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libApplyMod.Apply3C[F, U, L] {
  def of[A](a: A): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

