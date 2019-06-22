package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "field")
@js.native
object fieldNs extends js.Object {
  val fieldNumber: fpDashTsLib.libFieldMod.Field[scala.Double] = js.native
  def gcd[A](E: fpDashTsLib.libEqMod.Eq[A], field: fpDashTsLib.libFieldMod.Field[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
  def lcm[A](E: fpDashTsLib.libEqMod.Eq[A], F: fpDashTsLib.libFieldMod.Field[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
}

