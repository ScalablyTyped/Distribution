package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request message for ContentAddressableStorage.FindMissingBlobs.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2FindMissingBlobsRequest extends js.Object {
  /**
    * A list of the blobs to check.
    */
  var blobDigests: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2Digest]] = js.native
}

object Schema$BuildBazelRemoteExecutionV2FindMissingBlobsRequest {
  @scala.inline
  def apply(blobDigests: js.Array[Schema$BuildBazelRemoteExecutionV2Digest] = null): Schema$BuildBazelRemoteExecutionV2FindMissingBlobsRequest = {
    val __obj = js.Dynamic.literal()
    if (blobDigests != null) __obj.updateDynamic("blobDigests")(blobDigests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsRequest]
  }
}

