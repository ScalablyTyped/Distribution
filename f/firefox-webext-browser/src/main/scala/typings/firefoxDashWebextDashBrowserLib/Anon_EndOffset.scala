package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndOffset extends js.Object {
  var endOffset: scala.Double
  var endTextNodePos: scala.Double
  var framePos: scala.Double
  var startOffset: scala.Double
  var startTextNodePos: scala.Double
}

object Anon_EndOffset {
  @scala.inline
  def apply(
    endOffset: scala.Double,
    endTextNodePos: scala.Double,
    framePos: scala.Double,
    startOffset: scala.Double,
    startTextNodePos: scala.Double
  ): Anon_EndOffset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endOffset")(endOffset)
    __obj.updateDynamic("endTextNodePos")(endTextNodePos)
    __obj.updateDynamic("framePos")(framePos)
    __obj.updateDynamic("startOffset")(startOffset)
    __obj.updateDynamic("startTextNodePos")(startTextNodePos)
    __obj.asInstanceOf[Anon_EndOffset]
  }
}

