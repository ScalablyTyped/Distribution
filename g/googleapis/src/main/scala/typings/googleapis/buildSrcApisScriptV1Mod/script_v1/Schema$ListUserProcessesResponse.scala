package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with the list of Process resources.
  */
@js.native
trait Schema$ListUserProcessesResponse extends js.Object {
  /**
    * Token for the next page of results. If empty, there are no more pages
    * remaining.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of processes matching request parameters.
    */
  var processes: js.UndefOr[js.Array[Schema$GoogleAppsScriptTypeProcess]] = js.native
}

object Schema$ListUserProcessesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, processes: js.Array[Schema$GoogleAppsScriptTypeProcess] = null): Schema$ListUserProcessesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (processes != null) __obj.updateDynamic("processes")(processes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListUserProcessesResponse]
  }
}

