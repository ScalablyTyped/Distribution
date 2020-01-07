package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Containers Response.
  */
@js.native
trait Schema$ListContainersResponse extends js.Object {
  /**
    * All Containers of a GTM Account.
    */
  var container: js.UndefOr[js.Array[Schema$Container]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListContainersResponse {
  @scala.inline
  def apply(container: js.Array[Schema$Container] = null, nextPageToken: String = null): Schema$ListContainersResponse = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListContainersResponse]
  }
}

