package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#sizesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Size collection. */
  var sizes: js.UndefOr[js.Array[Size]] = js.undefined
}

object SizesListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, sizes: js.Array[Size] = null): SizesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    __obj.asInstanceOf[SizesListResponse]
  }
}

