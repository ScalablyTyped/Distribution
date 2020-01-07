package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputDirectory` is the output in an `ActionResult` corresponding to a
  * directory&#39;s full contents rather than a single file.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteexecutionV1testOutputDirectory extends js.Object {
  /**
    * DEPRECATED: This field is deprecated and should no longer be used.
    */
  var digest: js.UndefOr[Schema$GoogleDevtoolsRemoteexecutionV1testDigest] = js.native
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
  var treeDigest: js.UndefOr[Schema$GoogleDevtoolsRemoteexecutionV1testDigest] = js.native
}

object Schema$GoogleDevtoolsRemoteexecutionV1testOutputDirectory {
  @scala.inline
  def apply(
    digest: Schema$GoogleDevtoolsRemoteexecutionV1testDigest = null,
    path: String = null,
    treeDigest: Schema$GoogleDevtoolsRemoteexecutionV1testDigest = null
  ): Schema$GoogleDevtoolsRemoteexecutionV1testOutputDirectory = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (treeDigest != null) __obj.updateDynamic("treeDigest")(treeDigest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteexecutionV1testOutputDirectory]
  }
}

