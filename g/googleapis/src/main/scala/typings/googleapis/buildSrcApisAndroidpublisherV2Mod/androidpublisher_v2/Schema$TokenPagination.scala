package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TokenPagination extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var previousPageToken: js.UndefOr[String] = js.native
}

object Schema$TokenPagination {
  @scala.inline
  def apply(nextPageToken: String = null, previousPageToken: String = null): Schema$TokenPagination = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (previousPageToken != null) __obj.updateDynamic("previousPageToken")(previousPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TokenPagination]
  }
}

