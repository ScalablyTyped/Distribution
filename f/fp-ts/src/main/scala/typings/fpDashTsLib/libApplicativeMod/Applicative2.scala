package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplyMod.Apply2[F] {
  def of[L, A](a: A): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

