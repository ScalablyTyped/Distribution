package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContainerVersionsResponse extends js.Object {
  /** All container version headers of a GTM Container. */
  var containerVersionHeader: js.UndefOr[js.Array[ContainerVersionHeader]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListContainerVersionsResponse {
  @scala.inline
  def apply(
    containerVersionHeader: js.Array[ContainerVersionHeader] = null,
    nextPageToken: java.lang.String = null
  ): ListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (containerVersionHeader != null) __obj.updateDynamic("containerVersionHeader")(containerVersionHeader)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListContainerVersionsResponse]
  }
}

