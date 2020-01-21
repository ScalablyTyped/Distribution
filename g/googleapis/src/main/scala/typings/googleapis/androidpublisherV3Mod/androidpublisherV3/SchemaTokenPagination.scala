package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTokenPagination extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var previousPageToken: js.UndefOr[String] = js.native
}

object SchemaTokenPagination {
  @scala.inline
  def apply(nextPageToken: String = null, previousPageToken: String = null): SchemaTokenPagination = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (previousPageToken != null) __obj.updateDynamic("previousPageToken")(previousPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTokenPagination]
  }
}

