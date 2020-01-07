package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response corresponding to a single blob that the client tried to upload.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse extends js.Object {
  /**
    * The blob digest to which this response corresponds.
    */
  var digest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * The result of attempting to upload that blob.
    */
  var status: js.UndefOr[Schema$GoogleRpcStatus] = js.native
}

object Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse {
  @scala.inline
  def apply(digest: Schema$BuildBazelRemoteExecutionV2Digest = null, status: Schema$GoogleRpcStatus = null): Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]
  }
}

