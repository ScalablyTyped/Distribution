package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContainersResponse extends js.Object {
  /** All Containers of a GTM Account. */
  var container: js.UndefOr[js.Array[Container]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListContainersResponse {
  @scala.inline
  def apply(container: js.Array[Container] = null, nextPageToken: String = null): ListContainersResponse = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListContainersResponse]
  }
}

