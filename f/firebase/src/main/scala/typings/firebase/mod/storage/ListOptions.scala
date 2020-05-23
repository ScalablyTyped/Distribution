package typings.firebase.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options `list()` accepts.
  */
trait ListOptions extends js.Object {
  /**
    * If set, limits the total number of `prefixes` and `items` to return.
    * The default and maximum maxResults is 1000.
    */
  var maxResults: js.UndefOr[Double | Null] = js.undefined
  /**
    * The `nextPageToken` from a previous call to `list()`. If provided,
    * listing is resumed from the previous position.
    */
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

