package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetrosListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#metrosListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Metro collection. */
  var metros: js.UndefOr[js.Array[Metro]] = js.undefined
}

object MetrosListResponse {
  @scala.inline
  def apply(kind: String = null, metros: js.Array[Metro] = null): MetrosListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metros != null) __obj.updateDynamic("metros")(metros)
    __obj.asInstanceOf[MetrosListResponse]
  }
}

