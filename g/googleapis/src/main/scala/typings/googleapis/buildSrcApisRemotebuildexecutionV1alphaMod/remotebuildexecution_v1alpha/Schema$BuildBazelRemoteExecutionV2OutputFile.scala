package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputFile` is similar to a FileNode, but it is used as an output in an
  * `ActionResult`. It allows a full file path rather than only a name.
  * `OutputFile` is binary-compatible with `FileNode`.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2OutputFile extends js.Object {
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The full path of the file relative to the working directory, including
    * the filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.native
}

object Schema$BuildBazelRemoteExecutionV2OutputFile {
  @scala.inline
  def apply(
    digest: Schema$BuildBazelRemoteExecutionV2Digest = null,
    isExecutable: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): Schema$BuildBazelRemoteExecutionV2OutputFile = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(isExecutable)) __obj.updateDynamic("isExecutable")(isExecutable.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2OutputFile]
  }
}

