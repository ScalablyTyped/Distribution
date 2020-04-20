package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/equalizer.html#javascript-reference
trait Equalizer extends js.Object {
  def applyHeight(heights: js.Array[_]): Unit
  def applyHeightByRow(groups: js.Array[_]): Unit
  def destroy(): Unit
  def getHeights(cb: js.Function): js.Array[_]
  def getHeightsByRow(cb: js.Function): js.Array[_]
}

object Equalizer {
  @scala.inline
  def apply(
    applyHeight: js.Array[_] => Unit,
    applyHeightByRow: js.Array[_] => Unit,
    destroy: () => Unit,
    getHeights: js.Function => js.Array[_],
    getHeightsByRow: js.Function => js.Array[_]
  ): Equalizer = {
    val __obj = js.Dynamic.literal(applyHeight = js.Any.fromFunction1(applyHeight), applyHeightByRow = js.Any.fromFunction1(applyHeightByRow), destroy = js.Any.fromFunction0(destroy), getHeights = js.Any.fromFunction1(getHeights), getHeightsByRow = js.Any.fromFunction1(getHeightsByRow))
    __obj.asInstanceOf[Equalizer]
  }
}

