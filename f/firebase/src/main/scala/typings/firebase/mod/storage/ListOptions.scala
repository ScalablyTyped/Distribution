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
  def apply(maxResults: Int | Double = null, pageToken: String = null): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

