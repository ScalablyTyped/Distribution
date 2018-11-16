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

