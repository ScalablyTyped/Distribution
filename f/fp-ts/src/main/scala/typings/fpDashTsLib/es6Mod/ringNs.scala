package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "ring")
@js.native
object ringNs extends js.Object {
  def getFunctionRing[A, B](ring: fpDashTsLib.es6RingMod.Ring[B]): fpDashTsLib.es6RingMod.Ring[js.Function1[/* a */ A, B]] = js.native
  def getProductRing[A, B](RA: fpDashTsLib.es6RingMod.Ring[A], RB: fpDashTsLib.es6RingMod.Ring[B]): fpDashTsLib.es6RingMod.Ring[js.Tuple2[A, B]] = js.native
  def getTupleRing[T /* <: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6RingMod.Ring[_]] */](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rings because its type T is not an array type */ rings: T
  ): fpDashTsLib.es6RingMod.Ring[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends fp-ts.fp-ts/es6/Ring.Ring<infer A>? any : never}
    */ fpDashTsLib.fpDashTsLibStrings.getTupleRing with T
  ] = js.native
  def negate[A](ring: fpDashTsLib.es6RingMod.Ring[A]): js.Function1[/* a */ A, A] = js.native
}

