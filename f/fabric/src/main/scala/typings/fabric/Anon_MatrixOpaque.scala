package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MatrixOpaque extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
}

object Anon_MatrixOpaque {
  @scala.inline
  def apply(matrix: js.Array[Double] = null, opaque: js.UndefOr[Boolean] = js.undefined): Anon_MatrixOpaque = {
    val __obj = js.Dynamic.literal()
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MatrixOpaque]
  }
}

