package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.BatchReadBlobs.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse extends js.Object {
  /**
    * The responses to the requests.
    */
  var responses: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]] = js.native
}

object Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse] = null): Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  }
}

