package typings
package fpDashTsLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Field", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val fieldNumber: fpDashTsLib.libFieldMod.Field[scala.Double] = js.native
  def gcd[A](S: fpDashTsLib.libSetoidMod.Setoid[A], field: fpDashTsLib.libFieldMod.Field[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
  def lcm[A](S: fpDashTsLib.libSetoidMod.Setoid[A], F: fpDashTsLib.libFieldMod.Field[A]): js.Function2[/* x */ A, /* y */ A, A] = js.native
}

