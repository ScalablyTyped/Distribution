package typings.fuzzaldrin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxResults extends js.Object {
  var maxResults: js.UndefOr[Double] = js.undefined
}

object Anon_MaxResults {
  @scala.inline
  def apply(maxResults: Int | Double = null): Anon_MaxResults = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxResults]
  }
}

