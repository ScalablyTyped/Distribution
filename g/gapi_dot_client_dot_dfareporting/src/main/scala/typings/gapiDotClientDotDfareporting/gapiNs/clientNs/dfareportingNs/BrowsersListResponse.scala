package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersListResponse extends js.Object {
  /** Browser collection. */
  var browsers: js.UndefOr[js.Array[Browser]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#browsersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object BrowsersListResponse {
  @scala.inline
  def apply(browsers: js.Array[Browser] = null, kind: String = null): BrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[BrowsersListResponse]
  }
}

