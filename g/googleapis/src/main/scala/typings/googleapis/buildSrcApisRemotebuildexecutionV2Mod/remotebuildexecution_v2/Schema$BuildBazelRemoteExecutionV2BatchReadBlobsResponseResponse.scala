package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response corresponding to a single blob that the client tried to upload.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse extends js.Object {
  /**
    * The raw binary data.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The digest to which this response corresponds.
    */
  var digest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * The result of attempting to download that blob.
    */
  var status: js.UndefOr[Schema$GoogleRpcStatus] = js.native
}

object Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse {
  @scala.inline
  def apply(
    data: String = null,
    digest: Schema$BuildBazelRemoteExecutionV2Digest = null,
    status: Schema$GoogleRpcStatus = null
  ): Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]
  }
}

