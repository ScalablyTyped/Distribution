package typings
package fpDashTsLib.libRingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Ring", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getFunctionRing[A, B](ring: fpDashTsLib.libRingMod.Ring[B]): fpDashTsLib.libRingMod.Ring[js.Function1[/* a */ A, B]] = js.native
  def getProductRing[A, B](RA: fpDashTsLib.libRingMod.Ring[A], RB: fpDashTsLib.libRingMod.Ring[B]): fpDashTsLib.libRingMod.Ring[js.Tuple2[A, B]] = js.native
  def negate[A](ring: fpDashTsLib.libRingMod.Ring[A]): js.Function1[/* a */ A, A] = js.native
}

