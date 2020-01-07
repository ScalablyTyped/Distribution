package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Environments Response.
  */
@js.native
trait Schema$ListEnvironmentsResponse extends js.Object {
  /**
    * All Environments of a GTM Container.
    */
  var environment: js.UndefOr[js.Array[Schema$Environment]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListEnvironmentsResponse {
  @scala.inline
  def apply(environment: js.Array[Schema$Environment] = null, nextPageToken: String = null): Schema$ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListEnvironmentsResponse]
  }
}

