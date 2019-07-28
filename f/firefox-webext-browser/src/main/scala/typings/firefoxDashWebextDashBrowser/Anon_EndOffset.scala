package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndOffset extends js.Object {
  var endOffset: Double
  var endTextNodePos: Double
  var framePos: Double
  var startOffset: Double
  var startTextNodePos: Double
}

object Anon_EndOffset {
  @scala.inline
  def apply(
    endOffset: Double,
    endTextNodePos: Double,
    framePos: Double,
    startOffset: Double,
    startTextNodePos: Double
  ): Anon_EndOffset = {
    val __obj = js.Dynamic.literal(endOffset = endOffset, endTextNodePos = endTextNodePos, framePos = framePos, startOffset = startOffset, startTextNodePos = startTextNodePos)
  
    __obj.asInstanceOf[Anon_EndOffset]
  }
}

