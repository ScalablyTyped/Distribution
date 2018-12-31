package typings
package fpDashTsLib.libSemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroupoid2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def compose[L, A, B](ab: fpDashTsLib.libHKTMod.Type2[F, A, B], la: fpDashTsLib.libHKTMod.Type2[F, L, A]): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

