package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPagination extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var previousPageToken: js.UndefOr[String] = js.undefined
}

object TokenPagination {
  @scala.inline
  def apply(nextPageToken: String = null, previousPageToken: String = null): TokenPagination = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (previousPageToken != null) __obj.updateDynamic("previousPageToken")(previousPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPagination]
  }
}

