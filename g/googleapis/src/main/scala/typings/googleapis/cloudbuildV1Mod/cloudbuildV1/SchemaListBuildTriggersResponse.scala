package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing existing `BuildTriggers`.
  */
@js.native
trait SchemaListBuildTriggersResponse extends js.Object {
  /**
    * Token to receive the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * `BuildTriggers` for the project, sorted by `create_time` descending.
    */
  var triggers: js.UndefOr[js.Array[SchemaBuildTrigger]] = js.native
}

object SchemaListBuildTriggersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, triggers: js.Array[SchemaBuildTrigger] = null): SchemaListBuildTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListBuildTriggersResponse]
  }
}

