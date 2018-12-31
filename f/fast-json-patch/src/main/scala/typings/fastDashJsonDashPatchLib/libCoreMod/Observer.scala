package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var `object`: T
  var patches: js.Array[Operation]
  def callback(patches: js.Array[Operation]): scala.Unit
  def unobserve(): scala.Unit
}

