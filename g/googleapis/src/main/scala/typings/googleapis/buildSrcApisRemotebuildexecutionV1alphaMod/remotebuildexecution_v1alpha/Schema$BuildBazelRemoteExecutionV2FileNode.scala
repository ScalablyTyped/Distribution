package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `FileNode` represents a single file and associated metadata.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2FileNode extends js.Object {
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The name of the file.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$BuildBazelRemoteExecutionV2FileNode {
  @scala.inline
  def apply(
    digest: Schema$BuildBazelRemoteExecutionV2Digest = null,
    isExecutable: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): Schema$BuildBazelRemoteExecutionV2FileNode = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(isExecutable)) __obj.updateDynamic("isExecutable")(isExecutable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2FileNode]
  }
}

