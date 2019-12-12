package typings.atFirebaseStorage.distSrcListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  var maxResults: js.UndefOr[Double | Null] = js.undefined
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

