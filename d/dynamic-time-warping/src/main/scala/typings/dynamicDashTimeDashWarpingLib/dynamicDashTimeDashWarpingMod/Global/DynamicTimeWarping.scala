package typings
package dynamicDashTimeDashWarpingLib.dynamicDashTimeDashWarpingMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DynamicTimeWarping")
@js.native
class DynamicTimeWarping[T] protected () extends js.Object {
  def this(ser1: js.Array[T], ser2: js.Array[T], distFunc: js.Function2[/* a */ T, /* b */ T, scala.Double]) = this()
  def getDistance(): scala.Double = js.native
  def getPath(): js.Array[js.Tuple2[scala.Double, scala.Double]] = js.native
}

