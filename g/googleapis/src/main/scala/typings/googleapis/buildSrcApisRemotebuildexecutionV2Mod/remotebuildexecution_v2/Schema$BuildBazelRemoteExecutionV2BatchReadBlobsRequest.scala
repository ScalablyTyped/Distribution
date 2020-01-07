package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.BatchReadBlobs.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2BatchReadBlobsRequest extends js.Object {
  /**
    * The individual blob digests.
    */
  var digests: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2Digest]] = js.native
}

object Schema$BuildBazelRemoteExecutionV2BatchReadBlobsRequest {
  @scala.inline
  def apply(digests: js.Array[Schema$BuildBazelRemoteExecutionV2Digest] = null): Schema$BuildBazelRemoteExecutionV2BatchReadBlobsRequest = {
    val __obj = js.Dynamic.literal()
    if (digests != null) __obj.updateDynamic("digests")(digests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsRequest]
  }
}

