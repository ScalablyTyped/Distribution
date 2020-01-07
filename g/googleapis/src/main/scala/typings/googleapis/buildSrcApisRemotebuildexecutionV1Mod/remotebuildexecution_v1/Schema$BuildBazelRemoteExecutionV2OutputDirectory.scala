package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputDirectory` is the output in an `ActionResult` corresponding to a
  * directory&#39;s full contents rather than a single file.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2OutputDirectory extends js.Object {
  /**
    * The full path of the directory relative to the working directory. The
    * path separator is a forward slash `/`. Since this is a relative path, it
    * MUST NOT begin with a leading forward slash. The empty string value is
    * allowed, and it denotes the entire working directory.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The digest of the encoded Tree proto containing the directory&#39;s
    * contents.
    */
  var treeDigest: js.UndefOr[Schema$BuildBazelRemoteExecutionV2Digest] = js.native
}

object Schema$BuildBazelRemoteExecutionV2OutputDirectory {
  @scala.inline
  def apply(path: String = null, treeDigest: Schema$BuildBazelRemoteExecutionV2Digest = null): Schema$BuildBazelRemoteExecutionV2OutputDirectory = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (treeDigest != null) __obj.updateDynamic("treeDigest")(treeDigest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2OutputDirectory]
  }
}

