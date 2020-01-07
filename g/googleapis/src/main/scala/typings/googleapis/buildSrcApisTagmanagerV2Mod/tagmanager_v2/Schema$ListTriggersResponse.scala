package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List triggers response.
  */
@js.native
trait Schema$ListTriggersResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * All GTM Triggers of a GTM Container.
    */
  var trigger: js.UndefOr[js.Array[Schema$Trigger]] = js.native
}

object Schema$ListTriggersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, trigger: js.Array[Schema$Trigger] = null): Schema$ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTriggersResponse]
  }
}

