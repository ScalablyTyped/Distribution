package typings.fuzzaldrin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxResults extends js.Object {
  var maxResults: js.UndefOr[Double] = js.undefined
}

object MaxResults {
  @scala.inline
  def apply(maxResults: js.UndefOr[Double] = js.undefined): MaxResults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxResults]
  }
}

