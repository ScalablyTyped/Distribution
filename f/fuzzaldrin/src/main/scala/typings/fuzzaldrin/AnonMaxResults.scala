package typings.fuzzaldrin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxResults extends js.Object {
  var maxResults: js.UndefOr[Double] = js.undefined
}

object AnonMaxResults {
  @scala.inline
  def apply(maxResults: Int | Double = null): AnonMaxResults = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxResults]
  }
}

