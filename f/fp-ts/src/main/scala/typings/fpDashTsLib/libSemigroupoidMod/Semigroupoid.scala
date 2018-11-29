package typings
package fpDashTsLib.libSemigroupoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Semigroupoid[F] extends js.Object {
  val URI: F
  def compose[L, A, B](ab: fpDashTsLib.libHKTMod.HKT2[F, A, B], la: fpDashTsLib.libHKTMod.HKT2[F, L, A]): fpDashTsLib.libHKTMod.HKT2[F, L, B]
}

