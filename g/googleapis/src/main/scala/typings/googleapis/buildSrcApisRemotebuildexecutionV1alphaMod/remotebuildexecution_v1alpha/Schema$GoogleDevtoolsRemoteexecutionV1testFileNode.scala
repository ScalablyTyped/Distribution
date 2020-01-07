package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `FileNode` represents a single file and associated metadata.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteexecutionV1testFileNode extends js.Object {
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[Schema$GoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The name of the file.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemoteexecutionV1testFileNode {
  @scala.inline
  def apply(
    digest: Schema$GoogleDevtoolsRemoteexecutionV1testDigest = null,
    isExecutable: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): Schema$GoogleDevtoolsRemoteexecutionV1testFileNode = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(isExecutable)) __obj.updateDynamic("isExecutable")(isExecutable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteexecutionV1testFileNode]
  }
}

