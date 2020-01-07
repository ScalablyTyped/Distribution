package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request corresponding to a single blob that the client wants to upload.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest extends js.Object {
  /**
    * The raw binary data.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The digest of the blob. This MUST be the digest of `data`.
    */
  var digest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
}

object Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest {
  @scala.inline
  def apply(data: String = null, digest: Schema$BuildBazelRemoteExecutionV2Digest = null): Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]
  }
}

