package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opaque extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
}

object Opaque {
  @scala.inline
  def apply(matrix: js.Array[Double] = null, opaque: js.UndefOr[Boolean] = js.undefined): Opaque = {
    val __obj = js.Dynamic.literal()
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opaque]
  }
}

