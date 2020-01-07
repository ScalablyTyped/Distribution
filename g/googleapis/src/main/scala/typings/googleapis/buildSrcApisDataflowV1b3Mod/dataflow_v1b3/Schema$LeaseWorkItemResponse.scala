package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to lease WorkItems.
  */
@js.native
trait Schema$LeaseWorkItemResponse extends js.Object {
  /**
    * Untranslated bag-of-bytes WorkResponse for UnifiedWorker.
    */
  var unifiedWorkerResponse: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * A list of the leased WorkItems.
    */
  var workItems: js.UndefOr[js.Array[Schema$WorkItem]] = js.native
}

object Schema$LeaseWorkItemResponse {
  @scala.inline
  def apply(
    unifiedWorkerResponse: StringDictionary[js.Any] = null,
    workItems: js.Array[Schema$WorkItem] = null
  ): Schema$LeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    if (unifiedWorkerResponse != null) __obj.updateDynamic("unifiedWorkerResponse")(unifiedWorkerResponse.asInstanceOf[js.Any])
    if (workItems != null) __obj.updateDynamic("workItems")(workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LeaseWorkItemResponse]
  }
}

