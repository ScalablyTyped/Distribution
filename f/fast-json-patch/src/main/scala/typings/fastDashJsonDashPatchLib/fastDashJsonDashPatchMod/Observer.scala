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
    callback: js.Function1[js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation], scala.Unit],
    `object`: T,
    patches: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    unobserve: js.Function0[scala.Unit]
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(`object` = `object`.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("patches")(patches)
    __obj.updateDynamic("unobserve")(unobserve)
    __obj.asInstanceOf[Observer[T]]
  }
}

