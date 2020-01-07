package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.FindMissingBlobs.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse extends js.Object {
  /**
    * A list of the blobs requested *not* present in the storage.
    */
  var missingBlobDigests: js.UndefOr[js.Array[Schema$BuildBazelRemoteExecutionV2Digest]] = js.native
}

object Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse {
  @scala.inline
  def apply(missingBlobDigests: js.Array[Schema$BuildBazelRemoteExecutionV2Digest] = null): Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse = {
    val __obj = js.Dynamic.literal()
    if (missingBlobDigests != null) __obj.updateDynamic("missingBlobDigests")(missingBlobDigests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  }
}

