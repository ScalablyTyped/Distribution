package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matrix extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
}

object Matrix {
  @scala.inline
  def apply(matrix: js.Array[Double] = null): Matrix = {
    val __obj = js.Dynamic.literal()
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix]
  }
}

