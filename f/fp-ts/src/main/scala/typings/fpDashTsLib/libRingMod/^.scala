package typings
package fpDashTsLib.libRingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Ring", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getFunctionRing[A, B](ring: Ring[B]): Ring[js.Function1[/* a */ A, B]] = js.native
  def getProductRing[A, B](RA: Ring[A], RB: Ring[B]): Ring[js.Tuple2[A, B]] = js.native
  def getTupleRing[A, B](RA: Ring[A], RB: Ring[B]): Ring[js.Tuple2[A, B]] = js.native
  def negate[A](ring: Ring[A]): js.Function1[/* a */ A, A] = js.native
}

