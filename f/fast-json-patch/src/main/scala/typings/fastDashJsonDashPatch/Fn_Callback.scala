package typings.fastDashJsonDashPatch

import typings.fastDashJsonDashPatch.fastDashJsonDashPatchMod.Observer
import typings.fastDashJsonDashPatch.libCoreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply[T](obj: js.Array[T]): Observer[T] = js.native
  def apply[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  def apply[T](obj: js.Object): Observer[T] = js.native
  def apply[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
}

