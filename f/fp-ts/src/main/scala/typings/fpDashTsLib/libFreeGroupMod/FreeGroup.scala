package typings
package fpDashTsLib.libFreeGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/FreeGroup", "FreeGroup")
@js.native
class FreeGroup[A] protected () extends js.Object {
  def this(value: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val value: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libEitherMod.Either[A, A]] = js.native
  def ap[B](fab: FreeGroup[js.Function1[/* a */ A, B]]): FreeGroup[B] = js.native
  def ap_[B, C](`this`: FreeGroup[js.Function1[/* b */ B, C]], fb: FreeGroup[B]): FreeGroup[C] = js.native
  def chain[B](f: js.Function1[/* a */ A, FreeGroup[B]]): FreeGroup[B] = js.native
  def map[B](f: js.Function1[/* a */ A, B]): FreeGroup[B] = js.native
}

