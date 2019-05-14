package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ring")
@js.native
object ringNs extends js.Object {
  def getFunctionRing[A, B](ring: fpDashTsLib.libRingMod.Ring[B]): fpDashTsLib.libRingMod.Ring[js.Function1[/* a */ A, B]] = js.native
  def getProductRing[A, B](RA: fpDashTsLib.libRingMod.Ring[A], RB: fpDashTsLib.libRingMod.Ring[B]): fpDashTsLib.libRingMod.Ring[js.Tuple2[A, B]] = js.native
  def getTupleRing[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libRingMod.Ring[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rings because its type T is not an array type */ rings: T
  ): fpDashTsLib.libRingMod.Ring[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/lib/Ring.Ring<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleRing with T
  ] = js.native
  def negate[A](ring: fpDashTsLib.libRingMod.Ring[A]): js.Function1[/* a */ A, A] = js.native
}

