package typings.firebaseStorageTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  var maxResults: js.UndefOr[Double | Null] = js.undefined
  var pageToken: js.UndefOr[String | Null] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined
  ): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

