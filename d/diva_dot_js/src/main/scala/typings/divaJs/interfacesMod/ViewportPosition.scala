package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportPosition extends js.Object {
  var anchorPage: Boolean
  var horizontalOffset: Double
  var verticalOffset: Double
  var zoomLevel: Null | Double
}

object ViewportPosition {
  @scala.inline
  def apply(
    anchorPage: Boolean,
    horizontalOffset: Double,
    verticalOffset: Double,
    zoomLevel: Double = null.asInstanceOf[Double]
  ): ViewportPosition = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportPosition]
  }
}

