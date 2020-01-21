package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatrix extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonMatrix {
  @scala.inline
  def apply(matrix: js.Array[Double] = null): AnonMatrix = {
    val __obj = js.Dynamic.literal()
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatrix]
  }
}

