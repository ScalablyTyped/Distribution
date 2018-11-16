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

