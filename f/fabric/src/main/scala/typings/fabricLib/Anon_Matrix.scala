package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Matrix extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Matrix {
  @scala.inline
  def apply(matrix: js.Array[scala.Double] = null): Anon_Matrix = {
    val __obj = js.Dynamic.literal()
    if (matrix != null) __obj.updateDynamic("matrix")(matrix)
    __obj.asInstanceOf[Anon_Matrix]
  }
}

