package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.BatchUpdateBlobs.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse extends js.Object {
  /**
    * The responses to the requests.
    */
  var responses: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]] = js.native
}

object Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse] = null): Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  }
}

