package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.BatchUpdateBlobs.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest extends js.Object {
  /**
    * The individual upload requests.
    */
  var requests: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]] = js.native
}

object Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest {
  @scala.inline
  def apply(requests: js.Array[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest] = null): Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest]
  }
}

