package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARMatrices extends js.Object {
  var projectionMatrix: Matrix
  var transform: Matrix
  var viewMatrix: Matrix
}

object ARMatrices {
  @scala.inline
  def apply(projectionMatrix: Matrix, transform: Matrix, viewMatrix: Matrix): ARMatrices = {
    val __obj = js.Dynamic.literal(projectionMatrix = projectionMatrix.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewMatrix = viewMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARMatrices]
  }
}

