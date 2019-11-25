package typings.fastDashJsonDashPatch.moduleDuplexMod

import typings.fastDashJsonDashPatch.moduleCoreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var `object`: T
  var patches: js.Array[Operation]
  def callback(patches: js.Array[Operation]): Unit
  def unobserve(): Unit
}

object Observer {
  @scala.inline
  def apply[T](
    callback: js.Array[Operation] => Unit,
    `object`: T,
    patches: js.Array[Operation],
    unobserve: () => Unit
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), patches = patches.asInstanceOf[js.Any], unobserve = js.Any.fromFunction0(unobserve))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
}

