package typings
package fastDashJsonDashPatchLib.fastDashJsonDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var `object`: T
  var patches: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation]
  def callback(patches: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation]): scala.Unit
  def unobserve(): scala.Unit
}

object Observer {
  @scala.inline
  def apply[T](
    callback: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation] => scala.Unit,
    `object`: T,
    patches: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    unobserve: () => scala.Unit
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), patches = patches, unobserve = js.Any.fromFunction0(unobserve))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
}

