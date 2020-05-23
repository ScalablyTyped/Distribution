package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndOffset extends js.Object {
  var endOffset: Double
  var endTextNodePos: Double
  var framePos: Double
  var startOffset: Double
  var startTextNodePos: Double
}

object EndOffset {
  @scala.inline
  def apply(
    endOffset: Double,
    endTextNodePos: Double,
    framePos: Double,
    startOffset: Double,
    startTextNodePos: Double
  ): EndOffset = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], endTextNodePos = endTextNodePos.asInstanceOf[js.Any], framePos = framePos.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTextNodePos = startTextNodePos.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndOffset]
  }
}

