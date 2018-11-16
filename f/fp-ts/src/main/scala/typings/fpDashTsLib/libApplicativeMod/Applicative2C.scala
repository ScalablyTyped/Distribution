package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Applicative2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libApplyMod.Apply2C[F, L] {
  def of[A](a: A): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

