package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/equalizer.html#javascript-reference
trait Equalizer extends js.Object {
  def applyHeight(heights: js.Array[_]): scala.Unit
  def applyHeightByRow(groups: js.Array[_]): scala.Unit
  def destroy(): scala.Unit
  def getHeights(cb: js.Function): js.Array[_]
  def getHeightsByRow(cb: js.Function): js.Array[_]
}

object Equalizer {
  @scala.inline
  def apply(
    applyHeight: js.Function1[js.Array[_], scala.Unit],
    applyHeightByRow: js.Function1[js.Array[_], scala.Unit],
    destroy: js.Function0[scala.Unit],
    getHeights: js.Function1[js.Function, js.Array[_]],
    getHeightsByRow: js.Function1[js.Function, js.Array[_]]
  ): Equalizer = {
    val __obj = js.Dynamic.literal(applyHeight = applyHeight, applyHeightByRow = applyHeightByRow, destroy = destroy, getHeights = getHeights, getHeightsByRow = getHeightsByRow)
  
    __obj.asInstanceOf[Equalizer]
  }
}

