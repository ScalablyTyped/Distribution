package typings.firefoxDashWebextDashBrowser.browser.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* sessions types */
trait Filter extends js.Object {
  /**
    * The maximum number of entries to be fetched in the requested list. Omit this parameter to fetch the maximum
    * number of entries (`sessions.MAX_SESSION_RESULTS`).
    */
  var maxResults: js.UndefOr[Double] = js.undefined
}

object Filter {
  @scala.inline
  def apply(maxResults: Int | Double = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

