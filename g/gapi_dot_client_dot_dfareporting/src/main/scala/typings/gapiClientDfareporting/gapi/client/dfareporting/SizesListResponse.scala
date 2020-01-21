package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#sizesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Size collection. */
  var sizes: js.UndefOr[js.Array[Size]] = js.undefined
}

object SizesListResponse {
  @scala.inline
  def apply(kind: String = null, sizes: js.Array[Size] = null): SizesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizesListResponse]
  }
}

