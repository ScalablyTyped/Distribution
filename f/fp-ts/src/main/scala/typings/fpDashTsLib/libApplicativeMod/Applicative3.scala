package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Applicative3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libApplyMod.Apply3[F] {
  def of[U, L, A](a: A): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

