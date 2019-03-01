package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MatrixOpaque extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_MatrixOpaque {
  @scala.inline
  def apply(matrix: js.Array[scala.Double] = null, opaque: js.UndefOr[scala.Boolean] = js.undefined): Anon_MatrixOpaque = {
    val __obj = js.Dynamic.literal()
    if (matrix != null) __obj.updateDynamic("matrix")(matrix)
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    __obj.asInstanceOf[Anon_MatrixOpaque]
  }
}

