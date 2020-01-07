package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of the suggest API.
  */
@js.native
trait Schema$SuggestResponse extends js.Object {
  /**
    * List of suggestion results.
    */
  var suggestResults: js.UndefOr[js.Array[Schema$SuggestResult]] = js.native
}

object Schema$SuggestResponse {
  @scala.inline
  def apply(suggestResults: js.Array[Schema$SuggestResult] = null): Schema$SuggestResponse = {
    val __obj = js.Dynamic.literal()
    if (suggestResults != null) __obj.updateDynamic("suggestResults")(suggestResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestResponse]
  }
}

