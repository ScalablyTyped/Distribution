package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndOffset extends js.Object {
  var endOffset: Double
  var endTextNodePos: Double
  var framePos: Double
  var startOffset: Double
  var startTextNodePos: Double
}

object AnonEndOffset {
  @scala.inline
  def apply(
    endOffset: Double,
    endTextNodePos: Double,
    framePos: Double,
    startOffset: Double,
    startTextNodePos: Double
  ): AnonEndOffset = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], endTextNodePos = endTextNodePos.asInstanceOf[js.Any], framePos = framePos.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTextNodePos = startTextNodePos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndOffset]
  }
}

