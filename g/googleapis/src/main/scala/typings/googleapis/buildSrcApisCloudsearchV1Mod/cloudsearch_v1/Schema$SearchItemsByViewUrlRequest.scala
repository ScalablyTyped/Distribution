package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SearchItemsByViewUrlRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[Schema$DebugOptions] = js.native
  /**
    * The next_page_token value returned from a previous request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Specify the full view URL to find the corresponding item. The maximum
    * length is 2048 characters.
    */
  var viewUrl: js.UndefOr[String] = js.native
}

object Schema$SearchItemsByViewUrlRequest {
  @scala.inline
  def apply(debugOptions: Schema$DebugOptions = null, pageToken: String = null, viewUrl: String = null): Schema$SearchItemsByViewUrlRequest = {
    val __obj = js.Dynamic.literal()
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (viewUrl != null) __obj.updateDynamic("viewUrl")(viewUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchItemsByViewUrlRequest]
  }
}

