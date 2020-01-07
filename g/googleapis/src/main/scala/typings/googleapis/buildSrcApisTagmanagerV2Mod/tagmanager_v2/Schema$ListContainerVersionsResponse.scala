package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List container versions response.
  */
@js.native
trait Schema$ListContainerVersionsResponse extends js.Object {
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[Schema$ContainerVersionHeader]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListContainerVersionsResponse {
  @scala.inline
  def apply(
    containerVersionHeader: js.Array[Schema$ContainerVersionHeader] = null,
    nextPageToken: String = null
  ): Schema$ListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (containerVersionHeader != null) __obj.updateDynamic("containerVersionHeader")(containerVersionHeader.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListContainerVersionsResponse]
  }
}

